package com.package1;

import java.util.*;
public class DiffecultyTest {
    public static  Scanner s=new Scanner(System.in);
    public static int[] input(){
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            System.out.println("Value "+i+" = ");
            int b=s.nextInt();
            arr[i]=b;
        }return arr;
    }
    public static int check(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1000){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter number of loops = ");
        int a=s.nextInt();
      for(int i=1;i<=a;i++){
          int[] arr=input();
          System.out.println("Difficulty problems = "+check(arr));
      }

    }
}
