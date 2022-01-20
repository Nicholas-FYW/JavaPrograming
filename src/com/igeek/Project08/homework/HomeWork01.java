package com.igeek.Project08.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] persons =new Person[3];
        persons[0] = new Person("Tom", 18, "学生");
        persons[1] = new Person("Jack", 20, "学生");
        persons[2] = new Person("LIming", 16, "学生");
        bubbleSort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }

    }
    public static void bubbleSort(Person[] persons) {
        Person person = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length -1 -i; j++) {
                if(persons[j].getAge() < persons[j + 1].getAge()) {
                    person = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = person;
                }
            }
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
