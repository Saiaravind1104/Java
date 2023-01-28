package com.recurssion;

public class Factotial {
    public static int factorialNumber(int a){
        if(a==1){
            return 1;
        }
        int fact=factorialNumber(a-1);
        int temp=a*fact;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }
}
