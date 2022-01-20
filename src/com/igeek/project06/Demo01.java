package com.igeek.project06;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45,90};
        int[] arrNew = new int[arr.length + 1];
        int add = 99;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(add < arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }
        for(int i = 0; i < arr.length; i++) {
            if(i < index){
                arrNew[i] = arr[i];
            }
            else{
                arrNew[i + 1] = arr[i];
            }
        }
        arrNew[index] = add;
        arr = arrNew;
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
