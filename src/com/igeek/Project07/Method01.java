package com.igeek.Project07;

public class Method01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.speak();
        person1.cal(9);
    }
}
class Person {
    int age;
    public void speak() {

    }
    public void cal(int n) {
        int sum =0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("加和为" + sum);
    }
    public int add(int a, int b) {
        return a+b;
    }
}
