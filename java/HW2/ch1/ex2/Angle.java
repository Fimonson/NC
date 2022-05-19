package com.netcracker.HW2.ch1.ex2;

public class Angle {

    public static int angle(int x) {
        return (x + 360) % 360;
    }

    public static int methodfloormod(int x) {
        return Math.floorMod(x, 360);
    }

    public static void main(String[] args) {

        System.out.println("**%**");
        System.out.println(angle(-90));
        System.out.println(angle(190));
        System.out.println(angle(360));

        System.out.println("**floormod**");
        System.out.println(methodfloormod(-90));
        System.out.println(methodfloormod(190));
        System.out.println(methodfloormod(360));
    }
}
