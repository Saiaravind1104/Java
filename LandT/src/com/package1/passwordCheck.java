package com.package1;

import java.util.Scanner;

public class passwordCheck {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(){
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        int[]  arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value at index "+i+" = ");
            int b=s.nextInt();
            arr[i]=b;
        }return arr;
    }
    public static int[] Fixed(){
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        int[]  arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value at index "+i+" = ");
            int b=s.nextInt();
            arr[i]=b;
        }return arr;
    }
    public static boolean[] check(int[] arr,int[] arr1){
        int len=arr.length;
        int len1=arr1.length;
        int count=0;
        boolean[] status=new boolean[3];
        if(len==len1){
            for(int i=0;i<len;i++){
                if(arr[i]==arr1[i]){
                    status[i]=true;
                }else{
                    status[i]=false;
                }
            }
        }return status;
    }
    public static void count(boolean st[]){
        int count=0;
        int trueCount=0;
        for(int i=0;i<st.length;i++){
            if(st[i]==true){
                trueCount++;
            }else{
                count++;
            }
        }if(trueCount==st.length){
            System.out.println("Correct Password");
        }else{
            System.out.println(count+" number are missmatched");
        }
    }

    public static void main(String[] args) {
        int[] a=input();
        int[] b=Fixed();
        boolean[] status=check(a,b);
        count(status);

    }
}
