package com.netcracker.HW2.ch2.ex5;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        x=0;
        y=0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
            return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double s) {
        return new Point(this.x * s, this.y * s);
    }

    @Override
    public String toString() {
        return "Point (" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
