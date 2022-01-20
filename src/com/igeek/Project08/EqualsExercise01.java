package com.igeek.Project08;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("", 20, 'a');
        Person person2 = new Person("", 20, 'a');

        System.out.println(person1.equals(person2));
    }
}
class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public boolean equals(Object obj) {
        //先比较对象是否相同
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {
            Person person = (Person) obj;
            return this.name.equals(person.getName()) && this.age == person.getAge() && this.gender == person.getGender();
        }
        return false;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
}