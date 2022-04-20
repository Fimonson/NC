package com.netcracker.HW3.ch3;

public class Sheet {
    private int width;
    private int height;
    private final char name;

    public Sheet() {
        width = 841;
        height = 1189;
        name = '0';
    }

    private Sheet(int width, int height, char name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return "A" + name;
    }

    public Sheet cutInHalf() {
        char name = this.name;
        return new Sheet(height / 2, width, ++name);
    }

    public static void main(String[] args) {
        Sheet sheet1 = new Sheet();
        Sheet sheet2 = sheet1.cutInHalf();
        System.out.println(sheet1.getName() + " sizes " + sheet1.getWidth() + "x" + sheet1.getHeight());
        System.out.println(sheet2.getName() + " sizes " + sheet2.getWidth() + "x" + sheet2.getHeight());
    }
}
