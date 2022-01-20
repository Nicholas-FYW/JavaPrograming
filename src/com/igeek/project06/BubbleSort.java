package com.igeek.project06;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {24, 69, 80, 57, 13, 8, 52};
        int tempt = 0;
        int len = arr.length;
        for(int j = 0; j < len - 1; j++){
            for(int i = 0; i < len - 1 - j; i++){
                if(arr[i] > arr[i + 1]){
                    tempt = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tempt;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
