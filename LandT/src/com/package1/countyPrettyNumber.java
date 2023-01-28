package com.package1;

import java.util.Scanner;

public class countyPrettyNumber {
    public static Scanner s=new Scanner(System.in);
    public static int input(){
        System.out.println("Enter the starting value = ");
        int start=s.nextInt();
        System.out.println("Enter the end value = ");
        int end=s.nextInt();
        int count=0;
        for(int i=start;i<=end;i++){
            int last=i%10;
            if(last==2||last==3||last==9){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(input());
        }
    }
}
