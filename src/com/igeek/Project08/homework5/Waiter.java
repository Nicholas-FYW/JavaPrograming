package com.igeek.Project08.homework5;

public class Waiter extends Employee{
    public Waiter(double salary, String name) {
        super(salary, name);
    }
    @Override
    public void printSalary() {
        System.out.print("服务员");
        super.printSalary();
    }
}
