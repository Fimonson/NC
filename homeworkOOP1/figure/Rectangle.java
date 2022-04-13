package com.netcracker.homeworkOOP1.figure;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return width * 2.0 + length * 2.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Rectangle rectangle = (Rectangle) obj;
        if (length != rectangle.length) return false;
        return width == rectangle.width;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) length;
        result = 31 * result + (int) width;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle[length= " + length + ", width= " + width + "]\n";
    }
}
