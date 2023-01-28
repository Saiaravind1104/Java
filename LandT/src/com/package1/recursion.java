package com.package1;

import java.util.Scanner;

public class recursion {
    public static void input(String c){
        int a=c.length();
        String temp=c;
        for(int i=0;i<a;i++){
            char r=c.charAt(i);
            int count=0;
            for(int j=0;j<a;j++){
                char ch=temp.charAt(j);
                if(r==ch){
                    count++;
                }
            }

            System.out.print(r +"      "+count+"  ");
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ch=s.nextLine();
       input(ch);
    }
}
