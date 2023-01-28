package com.package2.mock2;

import java.util.Scanner;

public class OddCountFibanacheNumber {
    public static int oddCount(int val){
        int count=0;
        for(int i=val;i!=0;i/=10){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        for(int i=3;i<=input;i++){
            int c=a+b;
            int x=oddCount(c);
            if(x%2!=0){
                System.out.println(c);
            }
            a=b;
            b=c;

        }
    }
}
