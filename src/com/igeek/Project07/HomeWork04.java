package com.igeek.Project07;

public class HomeWork04 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        int[] arr = null;
        int[] arrNew = a03.copyArr(arr);
        if(arrNew != null) {
            for(int i = 0; i <arrNew.length; i++) {
                System.out.print(arrNew[i] + " ");
            }
        } else {
            System.out.println("null");
        }

    }
}
class A03 {
    public int[] copyArr(int[] arr) {
        if(arr != null) {
            int[] newArr = new int[arr.length];
            for(int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }
        return null;
    }
}
