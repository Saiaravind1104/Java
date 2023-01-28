package com.package1;

import java.util.Scanner;

public class arr1 {
    public static Scanner s=new Scanner(System.in);
    public static int[] userInput(){
        System.out.println("Enter the size of the array ");
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }return arr;
    }
    public static void display(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static int Max(int[] h){
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<h.length;i++){
            if(Max<h[i]){
                Max=h[i];
            }
        }return Max;
    }

    public static void main(String[] args) {


       int[] array=userInput();
       display(array);
        System.out.println(Max(array));
    }
}
