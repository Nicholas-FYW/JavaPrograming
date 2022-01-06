package com.igeek.project05;

public class MulForExercise03 {
    public static void main(String[] args) {
        //目标：打印一个空心金字塔
        //化繁为简、先死后活
        //1.打印一个矩形
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("*****");
        }
        //2.打印半个金字塔
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //3.打印整个金字塔
        for(int i = 1 ; i <= 5 ; i++){
            for(int k = 1 ; k <= 5-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2 * i - 1 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //4.打印空心金字塔
        int totalLevel = 5;
        for(int i = 1 ; i <= totalLevel ; i++){
            for(int k = 1 ; k <= totalLevel - i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2 * i - 1 ; j++){
                if(j == 1 || j == 2 * i - 1 || i == totalLevel ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
