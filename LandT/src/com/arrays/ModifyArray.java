package com.arrays;

public class ModifyArray {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0,0};
        //{1,5,2,3,4,0} {1,5,2,3,6,4}
        int pos=1;
        for(int j= arr.length-1;j>=pos;j--){
            arr[j]=arr[j-1];
        }
        arr[1]=5;
        pos=4;
        for(int j= arr.length-1;j>=pos;j--){
            arr[j]=arr[j-1];
        }
        arr[4]=6;
        print(arr);
    }

}
