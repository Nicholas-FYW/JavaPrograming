package com.igeek.Project08.homework11;

public class Person {
    private String name;
    private char sex;
    private int age;
    private String hobby;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void printInfo() {
        System.out.println(name + "\n" + age + "\n" + hobby);
    }

    public String play() {
        return name + "爱玩" + hobby;
    }
}
