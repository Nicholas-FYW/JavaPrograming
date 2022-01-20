package com.igeek.Project07;

public class OverLoadExercise {
    public static void main(String[] args) {

    }
}
class Methods {
    public void m(int a) {
        System.out.println(a * a);
    }
    public void m(int a, int b) {
        System.out.println(a * b);
    }
    public void m(String s) {
        System.out.println(s);
    }
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    public double max(double a, double b) {
        return a > b ? a : b;
    }
    public double max(double a, double b, double c) {
        double max1 = a > b ? a : b;
        return c > max1 ? c : max1;
    }
}
