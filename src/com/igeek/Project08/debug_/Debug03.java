package com.igeek.Project08.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {9, 2, -5, 100, 23};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
