package com.igeek.Project08.homework11;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age) {
        super(name, sex, age);
    }


    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {

        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(stu_id );
        study();
        System.out.println(play());

    }

    @Override
    public String play() {
        setHobby("足球");
        return super.play();
    }

}
