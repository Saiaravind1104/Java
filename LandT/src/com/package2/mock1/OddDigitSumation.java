package com.package2.mock1;

import java.util.Scanner;

public class OddDigitSumation {
    public static int check(int val){
        int sum=0;
        for(int i=val;i!=0;i/=10){
            int last=i%10;
            if(last%2!=0){
                sum+=last;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int a=0;
        int b=1;
        for(int i=3;i<=input;i++){
            int c=a+b;
            int check=check(c);
            System.out.println(check);
            a=b;
            b=c;
        }
    }
}
