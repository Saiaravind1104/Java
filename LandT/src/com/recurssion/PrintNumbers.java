package com.recurssion;

public class PrintNumbers {
    public static void print(int a){
        if(a==0){
            return;
        }
        print(a-1);
        System.out.print(a+" ");
    }
    public static void main(String[] args) {
        print(10);
    }
}
