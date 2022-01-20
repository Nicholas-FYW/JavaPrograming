package com.igeek.Project08;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;


    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        //过关斩将校验法
        if(!(obj instanceof Doctor)) {
            return false;
        }
        //向下转型
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.getName()) && this.age == doctor.getAge()
                && this.job.equals(doctor.getJob()) && this.gender.equals(doctor.getGender()) && this.sal == doctor.getSal();


    }
}
