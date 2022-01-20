package com.igeek.Project08.homework;

public class Worker {
    private double salary;
    private int days;
    private double grade;
    private String name;

    public Worker(double salary, int days, double grade, String name) {
        this.salary = salary;
        this.days = days;
        this.grade = grade;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printSalary() {
        System.out.println(days * salary *grade);
    }
}
