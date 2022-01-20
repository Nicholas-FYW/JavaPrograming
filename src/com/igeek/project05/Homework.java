package com.igeek.project05;

public class Homework {
    public static void main(String[] args) {
        int times = 0;
        double money = 100000;
        while(true){
            if(money > 50000){
                money *= 0.95;
            }
            else if(money >= 1000){
                money -= 1000;
            }
            else{
                break;
            }
            times++;
        }
        System.out.println("次数" + times);

        int a = 45;
        if(a > 0){
            System.out.println("正");
        }
        else if(a == 0){
            System.out.println("0");
        }
        else{
            System.out.println("负");
        }






    }
}
