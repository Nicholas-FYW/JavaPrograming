package com.igeek.Project07;

public class HomeWork07 {
    public static void main(String[] args) {

    }
}
class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void show() {
        System.out.println(name + age + color);
    }
}
