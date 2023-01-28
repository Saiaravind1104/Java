package com.recurssion;

public class Fibanochi {
    public static int fib(int n){
        int a=0;
        int b=1;
        int count=2;
        if(count==n){
            return 0;
        }
        count++;
        return a+b+fib(a+1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        for(int i=3;i<=8;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }
}
