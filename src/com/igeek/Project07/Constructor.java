package com.igeek.Project07;

public class Constructor {
    public static void main(String[] args) {
        PersonA p = new PersonA("xiaoming", 99);
        System.out.println(p.nameA + p.ageA);
    }
}
class PersonA {
    String nameA;
    int ageA;
    public PersonA(String name, int age) {
        nameA = name;
        ageA = age;
    }
}
