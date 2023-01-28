package com.package1;

import java.util.Scanner;

public class samePosition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        String str=s.nextLine();
        String sto="";
        int len=str.length();
        char[] arr=new char[str.length()];
        char[] rev=new char[len];
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);

             sto=ch+sto;
            arr[i]=ch;
        }
        for(int i=0;i<str.length();i++){
            char ch=sto.charAt(i);
            rev[i]=ch;
        }
        for(int i=0;i<len;i++){
            if(arr[i]==rev[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
