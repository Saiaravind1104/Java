package com.package1;

import java.security.PublicKey;
import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        int a=2;
        int count=0;
        while(count<=100){
            int check=0;
            for(int i=2;i<a;i++){
                if(a%i==0){
                    check++;
                }
            }if(check==0){
                System.out.println(a);
                count++;
            }a++;
        }
    }
}
