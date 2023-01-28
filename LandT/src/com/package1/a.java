package com.package1;

import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(){
        System.out.println("Enter the Size of the array = ");
        int b=s.nextInt();
        int[] arr=new int[b];
        for(int i=0;i<b;i++){
            System.out.println("Enter the value at index "+i+" = ");
            int c=s.nextInt();
            arr[i]=c;
        }return arr;
    }
    public static int[] high(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }return ar;
    }
    public static long pal(int[] ar){
        long rev=0;
        for(int i=0;i< ar.length;i++){
            rev=rev*1000+ar[i];
        }return rev;
    }


    public static void main(String[] args) {
        int[] arr=input();
        int[] high=high(arr);
      System.out.println("Highest = "+pal(high));

    }
}
