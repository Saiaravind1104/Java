package com.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class pass1 {
    public static Scanner s=new Scanner(System.in);
    public static int input(){
        System.out.println("Enter the input = ");
        int a=s.nextInt();
        return a;
    }
    public static  void check(int a){
        System.out.println("Enter the password = ");
        int b=s.nextInt();

       if(a==b){
           System.out.println("Correct password ");
       }else{
           int count=0;

       }

    }
    public static void main(String[] args) {
        int a=input();
        check(a);

    }
}
