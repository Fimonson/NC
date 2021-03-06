package com.netcracker.homeworkOOP2;

import com.netcracker.homeworkOOP2.Ball;
import com.netcracker.homeworkOOP2.Container;

public class Container {
    private final int x1, x2;
    private final int y1, y2;

    public Container() {
        this(0, 0, 1600, 1200);
    }

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = width + this.x1;
        this.y2 = height + this.y1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return this.x2 - this.x1;
    }

    public int getHeight() {
        return this.y2 - this.y1;
    }

    public boolean collides(Ball ball) {
        double op2X = ball.getX();
        double op2Y = ball.getY();
        double op2Radius = ball.getRadius();

        return (
                (op2X - op2Radius) > this.x1 &&
                        (op2X + op2Radius) < this.getWidth() &&
                        (op2Y - op2Radius) > this.y1 &&
                        (op2Y + op2Radius) < this.getHeight()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Container container = (Container) obj;
        return x1 == container.x1 && y1 == container.y1
                && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;
        return result;
    }

    @Override
    public String toString() {
        return "Container = {(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")}";
    }
}