package com.package1;

import java.util.Scanner;

public class sort {
    public static  Scanner s=new Scanner(System.in);
    public static int[] user(){
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the index value of "+i+" = ");
            arr[i]=s.nextInt();
        }return arr;
    }
    public static int[] sort(){
        int[] array=user();
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }return array;
    }
    public static void display(){
        int[] ar=sort();
        for(int val:ar){
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        display();
    }
}
