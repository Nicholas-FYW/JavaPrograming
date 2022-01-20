package com.igeek.Project08.homework11;

public class Text {
    public static void main(String[] args) {
        Person[] persons = new Person[4];

    }

    public static void work(Person person) {
        if(person instanceof Student) {
            Student student = (Student) person;
            student.study();
        }
        if(person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.teach();
        }
    }
}
