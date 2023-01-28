package com.package1;

import java.util.Scanner;

public class ar1 {
    public static Scanner s=new Scanner(System.in);
    public static int user(int a,int b,char operator){

       int temp=0;
        for(int i=0;i<=1;i++){
            if(operator=='+'){
                 temp=a+b;
            }else if(operator=='-'){
                temp=a-b;
            }else if(operator=='*'){
                temp=a*b;
            }else if(operator=='/'){
                temp=a/b;
            }else if(operator=='%'){
                temp=a-b;
            }else{
               temp=-1;
            }
        }return temp;
    }

    public static void main(String[] args) {
        String str=s.nextLine();
        char c=str.charAt(0);
        int a=s.nextInt();
        int b=s.nextInt();
        int v=user(a,b,c);
        System.out.println(v);
    }
}
