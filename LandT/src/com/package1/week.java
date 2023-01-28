package com.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class week {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(){
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            System.out.println("Value "+i+" = ");
            int num=s.nextInt();
            arr[i]=num;
        }
       return arr;

    }
    public static int check(int[] ar){
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>=10){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int[] ar=input();
            System.out.println(check(ar));
        }

    }
}
