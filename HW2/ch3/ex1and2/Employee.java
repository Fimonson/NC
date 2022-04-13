package com.netcracker.HW2.ch3.ex1and2;

public class Employee implements Measurable {
    private final int id;
    private final String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static double average(Measurable[] objects) {
        double result = 0;
        for (int i = 0; i < objects.length; i++) {
            result += objects[i].getMeasure();
        }
        return result / objects.length;
    }

    public static String largest(Measurable[] objects) {
        Employee[] employees = (Employee[]) objects;
        String result = null;
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getMeasure()) {
                maxSalary = employees[i].getMeasure();
                result = employees[i].getName();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Employee{ id= "+id+", name= "+name+", salary= "+salary+"}";
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(1, "How", 100);
        employees[1] = new Employee(2, "are", 200);
        employees[2] = new Employee(3, "you", 800);
        employees[3] = new Employee(4, "Gleb", 400);
        System.out.println(average(employees));
        System.out.println("The largest salary is " + largest(employees));
    }
}
