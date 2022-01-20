package com.igeek.Project07;

public class HomeWork05 {
    public static void main(String[] args) {

    }
}
class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter() {
        return Math.PI * radius * radius ;
    }
    public double area() {
        return 2 * Math.PI * radius;
    }
}