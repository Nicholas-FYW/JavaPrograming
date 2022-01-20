package com.igeek.Project07;

public class HomeWork13 {
    public static void main(String[] args) {

    }
}
class Circle01 {
    double radius;
    double findArea() {
        return Math.PI * radius * radius;
    }
    void setRadius(int radius) {
        this.radius = radius;
    }
}
class PassObject {
    public void printArea(Circle01 c,int times) {
        System.out.println("i\tarea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(i +"\t" + c.findArea());
        }
    }
}