package com.netcracker.HW3.ch3;

public class Battery {
    private double remainingCapacity;
    private double capacity;
    public Battery(double capacity){
        this.remainingCapacity=capacity;
        this.capacity=capacity;
    }
    public void drain(double amount){
        remainingCapacity-=amount;
    }
    public void charge(){
        remainingCapacity=capacity;
    }
    public double getRemainingCapacity(){
        return remainingCapacity;
    }

    public static void main(String[] args) {
        Battery battery=new Battery(2000);
        battery.drain(761.25);
        System.out.println(battery.getRemainingCapacity());
        battery.charge();
        System.out.println(battery.getRemainingCapacity());
    }
}
