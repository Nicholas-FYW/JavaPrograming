package com.igeek.project06;

public class SeqSearch {
    public static void main(String[] args){
        int key = 1;
        int[] arr = {12, 26, 35, 69, 82, 102};
        int begin = 0;
        int end = arr.length - 1;
        int index = binSearch(arr,key,begin,end);
        if(index == -1){
            System.out.println("fail");
        }
    }
    public static int binSearch(int[] arr, int key, int begin, int end){
        int mid = (int)((double)(begin + end) / 2);
        int flag = 0;
        while(begin <= end){
            if(arr[mid] == key){
                System.out.println(mid);
                return mid;
            }
            if(arr[mid] < key){
                begin = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = (int)((double)(begin + end) / 2);
        }
        return -1;
    }
}
