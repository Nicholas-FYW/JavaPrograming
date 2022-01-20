package com.igeek.Project08.poly_;

public class poly01 {
    public static void main(String[] args) {
        Master master = new Master("Tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大骨头");
        master.feed(dog, bone);
    }
}
