package com.igeek.Project08.homework5;

public class Teacher extends Employee {
    private double money;
    private int day;
    public Teacher(double salary, String name) {
        super(salary, name);
    }
    @Override
    public void printSalary() {
        System.out.println("工资为" + money * day +  getSalary() *  getMonths());
    }
}
