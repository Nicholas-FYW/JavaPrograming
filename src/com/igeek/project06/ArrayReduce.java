package com.igeek.project06;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        while(true){
            if(arr.length == 1){
                break;
            }
            int[] arrNew = new int[arr.length - 1];
            for(int i = 0; i < arrNew.length; i++){
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
                System.out.print( '\t');
            }
            System.out.println("y/n");
            Scanner myScanner = new Scanner(System.in);
            char answer = myScanner.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        }
    }
}
