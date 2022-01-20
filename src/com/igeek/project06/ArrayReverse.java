package com.igeek.project06;

public class ArrayReverse {
    public static void main(String[] args) {
        //老韩思路
        //规律
        //1. 把 arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
        //2. 把 arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
        //3. 把 arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
        //4. 一共要交换 3 次 = arr.length / 2
        //5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 -i]
        //代码
        //优化
        int[] a = {1, 2, 3, 4, 5, 6};
        int len = a.length;
        int tempt = 0;
        for(int i = 0; i < len / 2; i++){
            tempt = a[len - 1 - i];
            a[len - 1 - i] = a[i];
            a[i] = tempt;
        }
        for(int i = 0; i < len; i++){
            System.out.print(a[i] + " ");
        }
    }
}
