package com.igeek.project05;
public class MulForExercise02 {
    public static void main(String[] args) {
        //九九乘法表
        //1.化繁为简
        //2.先死后活
        int row = 9;
        for(int j = 1 ; j <= row ; j++){
            for(int i = 1 ; i <= j ; i++){
                System.out.print(i + "*" + j + "=" + (i*j));
                System.out.print("\t");
            }
            System.out.println("");
        }

    }
}
