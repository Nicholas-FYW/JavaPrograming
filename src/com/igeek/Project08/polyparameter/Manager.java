package com.igeek.Project08.polyparameter;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("manager" + super.getName() + "正在管理");
    }
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
