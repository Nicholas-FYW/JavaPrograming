package com.igeek.Project08.homework;

public class Manager extends Worker{
    private double bonus;

    public Manager(double salary, int days, double grade, String name) {
        super(salary, days, grade, name);
    }
    @Override
    public void printSalary() {
        System.out.println("经理" + bonus + getSalary() * getDays() * getGrade());
    }
}
