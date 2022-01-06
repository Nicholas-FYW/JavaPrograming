package com.igeek.project05;

import java.util.Scanner;

//多重循环控制
public class MulForExercise01 {
    public static void main(String[] args){
        //记录所有学生的总成绩
        double totalScore = 0;
        double allScore = 0;
        int grades = 3;
        int students = 5;
        int passStudents = 0;
        //输入每个班级的学生成绩
        for (int i = 1; i <= grades; i++){
            //输入一个班级每个学生的成绩
            for(int j = 1 ; j <= students ; j++ ){
                Scanner scanner = new Scanner(System.in);
                int score = scanner.nextInt();
                if(score >= 60){
                    passStudents++;
                }
                System.out.println("成绩" + score);
                totalScore += score;
                allScore += score;
            }
            System.out.println("平均成绩" + totalScore / students);
        }
        System.out.println("平均成绩" + allScore / (students * grades));
        System.out.println("及格人数" + passStudents);
    }
}
