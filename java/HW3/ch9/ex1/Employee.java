package com.netcracker.HW3.ch9.ex1;

public class Employee {
    private String name;
    private double baseSalary;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBaseSalary(double newSalary) {
        this.baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }
}
