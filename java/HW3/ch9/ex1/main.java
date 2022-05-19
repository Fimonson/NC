package com.netcracker.HW3.ch9.ex1;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Alexey");
        employee.setBaseSalary(1_000_000);
        Manager manager1 = new Manager("Cristiano Ronaldo", 121_222, 350);
        System.out.println("Employee " + employee.getName() + " - salary " + employee.getSalary());
        System.out.println("Manager " + manager1.getName() + " - salary " + manager1.getSalary() + "" +
                " (bonus " + manager1.getBonus() + ")");
        Employee manager2 = new Manager("Messi", 0, 0);
        Manager manager3 = (Manager) manager2;
        manager3.setName("Mbappe");
        manager3.setSalary(2_123_500);
        System.out.println("Manager " + manager3.getName() + " - salary " + manager3.getSalary() + "" +
                " (bonus " + manager3.getBonus() + ")");
    }
}
