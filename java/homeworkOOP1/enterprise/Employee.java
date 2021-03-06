package com.netcracker.homeworkOOP1.enterprise;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee() {
        this(0, "Anonymous", "", 0);
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && salary == employee.salary
                && firstName == employee.firstName && lastName == employee.lastName;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + salary;
        for (int i = 0; i < firstName.length(); i++)
            result = 31 * result + (int) firstName.charAt(i);
        for (int i = 0; i < lastName.length(); i++)
            result = 31 * result + (int) lastName.charAt(i);
        return result;
    }

    @Override
    public String toString() {
        return (
                "Employee = { " +
                        "id = " + id + ", " +
                        "name = " + firstName + ", " +
                        "lastname = " + lastName + ", " +
                        "salary = " + salary +
                        " }"
        );
    }

    public static void main(String[] args) {

        Employee e = new Employee(7, "Alexei", "Vaganov", 100000);
        System.out.println(e.toString());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        System.out.println(e.raiseSalary(20));

        System.out.println();
    }
}
