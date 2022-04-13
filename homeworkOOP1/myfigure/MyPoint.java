package com.netcracker.homeworkOOP1.myfigure;

import com.netcracker.homeworkOOP1.figure.Circle;

import java.util.Arrays;

public class MyPoint {
    private int x, y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(MyPoint mp) {
        this.x = mp.x;
        this.y = mp.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        MyPoint myPoint = (MyPoint) obj;
        if (x != myPoint.x) return false;
        return y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int a = (this.x - x);
        int b = (this.y - y);

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double distance(MyPoint op2) {
        int a = (this.x - op2.x);
        int b = (this.y - op2.y);

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }


    public double distance() {
        return this.distance(0, 0);
    }

    public static void main(String[] args) {

        MyPoint mp = new MyPoint(1, 1);
        System.out.println(mp.toString());
        System.out.println(mp.getX());
        System.out.println(Arrays.toString(mp.getXY()));

        System.out.println();

        MyPoint mp2 = new MyPoint(0, 4);
        mp2.setX(4);
        System.out.println(mp2.getX());

        double dis = mp.distance(mp2);
        System.out.println(dis);

        System.out.println();
    }

}

