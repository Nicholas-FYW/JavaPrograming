package com.igeek.Project08.homework5;

public class Scientist extends Employee {
    private double bonus;

    public Scientist(double salary, String name) {
        super(salary, name);
    }

    @Override
    public void printSalary() {
        System.out.println("工资为" + bonus + getSalary() * getMonths());
    }

}
