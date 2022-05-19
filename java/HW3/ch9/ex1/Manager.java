package com.netcracker.HW3.ch9.ex1;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super.setName(name);
        super.setBaseSalary(salary + bonus);
        this.bonus = bonus;
    }

    public void setSalary(double newSalary) {
        super.setBaseSalary(newSalary + bonus);
    }

    public void setName(String newName) {
        super.setName(newName);
    }

    public double getBonus() {
        return bonus;
    }
}
