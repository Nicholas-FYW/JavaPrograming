package com.igeek.Project08.homework5;

public class Employee {
    private double salary;
    private String name;
    private int Months = 12;//13

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonths() {
        return Months;
    }

    public void setMonths(int months) {
        Months = months;
    }
    public void printSalary() {
        System.out.println("salary为" + salary * Months);
    }
}
