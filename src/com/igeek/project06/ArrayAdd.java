package com.igeek.project06;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        while(true){
            int[] arrNew = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++){
                arrNew[i] = arr[i];
            }

            int add = myScanner.nextInt();
            arrNew[arrNew.length - 1] = add;
            arr = arrNew;
            for(int i = 0; i < arr.length ; i++){
                System.out.println(arr[i]);
            }
            System.out.println("y/n");
            char answer = myScanner.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        }
    }
}
