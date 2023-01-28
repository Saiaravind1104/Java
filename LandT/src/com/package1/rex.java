package com.package1;

public class rex {
    public static int input(int[] arr,int b,int c,int d){

       if(c>=d){
           return -1;
       }else {

           int mid = (c + d) / 2;
           if (b == arr[mid]) {
               return mid;
           } else if (arr[mid] < b) {
               return input(arr, b, mid + 1, d);
           } else {
               return input(arr, b, c, mid - 1);
           }
       }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=input(arr,5,0,arr.length);
        System.out.println(x);
    }
}
