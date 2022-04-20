package com.netcracker.HW3.ch8;

public class ComboLock {
    private int[] code = new int[3];
    private int[] attempt = new int[3];
    private int[] direction = new int[3];
    private int pos;
    private int count;

    public ComboLock(int secret1, int secret2, int secret3) {
        code[0] = secret1;
        code[1] = secret2;
        code[2] = secret3;
        pos = 0;
        count = 0;
    }

    public void reset() {
        attempt[0] = 0;
        attempt[1] = 0;
        attempt[2] = 0;
    }

    public void turnLeft(int ticks) {
        pos = pos - ticks;
        if (pos<0)
            pos+=40;
        attempt[count] = pos;
        direction[count] = 1;
        count++;
    }

    public void turnRight(int ticks) {
        pos = pos + ticks;
        if(pos>39)
            pos-=40;
        attempt[count] = pos;
        direction[count] = 0;
        count++;
    }

    public boolean open() {
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            if (attempt[i] == code[i]) {
                correct++;
            }

        }

        if (direction[0] == 0 && direction[1] == 1 && direction[2] == 0) {
            correct++;
        }
        if (correct == 4) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ComboLock comboLock1= new ComboLock(30, 3, 0);
        ComboLock comboLock2= new ComboLock(25, 3, 3);
        ComboLock comboLock3= new ComboLock(1, 2, 3);

        comboLock1.turnRight(30);
        comboLock1.turnLeft(27);
        comboLock1.turnRight(37);
        System.out.println(comboLock1.open());

        comboLock2.turnRight(25);
        comboLock2.turnLeft(22);
        comboLock2.turnRight(37);//error
        System.out.println(comboLock2.open());

        comboLock3.turnRight(1);
        comboLock3.turnRight(1);//error
        comboLock3.turnRight(1);
        System.out.println(comboLock3.open());

    }
}
