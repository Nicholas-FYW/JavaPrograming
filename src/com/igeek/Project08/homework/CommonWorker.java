package com.igeek.Project08.homework;

public class CommonWorker extends Worker {

    public CommonWorker(double salary, int days, double grade, String name) {
        super(salary, days, grade, name);
    }
    @Override
    public void printSalary() {
        System.out.println("普通员工");
        super.printSalary();
    }
}
