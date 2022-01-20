package com.igeek.Project08.polyparameter;

public class PloyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker("worker", 100);
        Manager manager = new Manager("manager", 200, 20);
        String s = "sd";
        s.equals("df");
        showEmpAnnual(worker);
        showEmpAnnual(manager);
        testWork(worker);
        testWork(manager);
    }

    public static void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public static void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
