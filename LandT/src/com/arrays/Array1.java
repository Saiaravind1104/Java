package com.arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
       int[] arr={1,2,0,4,5,0};
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               if(arr[i]!=0){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }

           }
       }
       for(int val:arr){
           System.out.println(val);
       }


    }
}
