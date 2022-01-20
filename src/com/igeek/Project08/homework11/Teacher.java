package com.igeek.Project08.homework11;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学\n");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(work_age );
        teach();
        System.out.println(play());

    }

    @Override
    public String play() {
        setHobby("象棋");
        return super.play();
    }
}
