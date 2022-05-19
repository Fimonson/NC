package com.netcracker.homeworkOOP2;

public class Ball {
    private double x, y;
    private int radius;
    private double xDelta, yDelta;

    public Ball() {
        this(0, 0, 1, 1, 90);
    }

    public Ball(double x, double y, int radius, int speed, int direction) throws ArithmeticException {
        if (direction > 180 || direction < -180) {
            throw new ArithmeticException("the direction is not located in [-180, 180] -> " + direction);
        }

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(direction);
        this.yDelta = (-1) * speed * Math.sin(direction);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta *= (-1);
    }

    public void reflectVertical() {
        this.yDelta *= (-1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Ball ball = (Ball) obj;
        return x == ball.x && y == ball.y
                && radius == ball.radius && xDelta == ball.xDelta && yDelta == ball.yDelta;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + radius;
        result = 31 * result + (int) x;
        result = 31 * result + (int) y;
        result = 31 * result + (int) xDelta;
        result = 31 * result + (int) yDelta;
        return result;
    }

    @Override
    public String toString() {
        return "Ball = {(" + x + ", " + y + "), speed = " + xDelta + ", " + yDelta + ")}";
    }

    public static void main(String[] args) {

        Ball b = new Ball();
        System.out.println(b.toString());

        for (int i = 0; i < 4; i++) b.move();

        System.out.println(b.getX());
        b.reflectHorizontal();
        System.out.println(b.toString());

        Container c = new Container();
        System.out.println(c.collides(b));
        System.out.println(c.toString());
    }
}

