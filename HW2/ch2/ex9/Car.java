package com.netcracker.HW2.ch2.ex9;

public class Car {
    private double gallons;
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.gallons=0;
    }

    public void addGallons(double gallons) {
        this.gallons = gallons;
    }

    public double drive() {
        return this.gallons * this.fuelEfficiency;
    }

    public void needDrive(double x) {
        if (x == this.drive()) {
            System.out.println("the car passed " + x + " miles");
        } else if (x < this.drive()) {
            this.gallons = (this.drive() - x) / this.fuelEfficiency;
            System.out.println("the car passed " + x + " miles and " + gallons + " gallons left");

        } else {
            double needGallons = (x - this.drive()) / this.fuelEfficiency;
            this.addGallons(needGallons);
            System.out.println("the car passed " + x + " miles, but added " + needGallons + " gallons");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(0.5);
        Car car2 = new Car(1.2);
        Car car3 = new Car(1);

        System.out.println("Car #1");
        car1.needDrive(270);

        System.out.println("Car #2");
        car2.addGallons(500);
        car2.needDrive(70);

        System.out.println("Car #3");
        car3.addGallons(100);
        car3.needDrive(100);
    }
}
