package com.netcracker.homeworkOOP1.figure;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Circle circle = (Circle) obj;
        if (color != circle.color) return false;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) radius;
        for (int i = 0; i < color.length(); i++)
            result = 31 * result + (int) color.charAt(i);
        return result;
    }

    @Override
    public String toString() {
        return "Circle[radius= " + radius + ", color= " + color + "]\n";
    }
}