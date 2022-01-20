package com.igeek.Project07;

import java.util.Scanner;

public class HmoeWork02 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        A02 a02 = new A02();
        String[] arr = {"I", "love", "you"};
        Integer index = a02.find(arr, "love");
        if(index != null) {
            System.out.println(index);
        } else {
            System.out.println("不可以输入null");
        }

    }
}
class A02 {
    public Integer find(String[] arr, String a) {
        if(arr != null) {
            int index = -1;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals(a)) {
                    index = i;
                }
            }
            return index;
        }
        return null;
    }
}