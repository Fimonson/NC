package com.netcracker.HW3.ch9.project1;

import java.util.ArrayList;

public class ChessPiece {
    private String position;
    ArrayList<String> moveTo = new ArrayList<>();

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMoveTo(String moveTo) {
        this.moveTo.add(moveTo);
    }

    public ArrayList<String> canMoveTo() {
        return moveTo;
    }

    static public String getString(int i, int j) {
        String result = null;
        ++i;
        if (j == 0)
            result = "a" + i;
        if (j == 1)
            result = "b" + i;
        if (j == 2)
            result = "c" + i;
        if (j == 3)
            result = "d" + i;
        if (j == 4)
            result = "e" + i;
        if (j == 5)
            result = "f" + i;
        if (j == 6)
            result = "g" + i;
        if (j == 7)
            result = "h" + i;
        return result;
    }
}
