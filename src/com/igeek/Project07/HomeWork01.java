package com.igeek.Project07;

public class HomeWork01 {
    public static void main(String[] args) {
        double[] arr = null;
        A01 a01 = new A01();
        Double max = a01.max(arr);
        if(max != null) {
            System.out.println(max);
        } else {
            System.out.println("不可以为{}和null");
        }
    }
}
class A01 {
    public Double max(double... arr) {
        if(arr != null && arr.length > 0) {
            double max1 = arr[0];
            for (int i=1; i < arr.length; i++) {
                if(arr[i] > max1) {
                    max1 = arr[i];
                }
            }
            return max1;
        } else {
            return null;
        }

    }
}