package com.jspydertest;

import java.util.Scanner;

public class SpyNumber {
    // spynumber :-
    //123 = 1*2*3 == 1+2+3
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();//start
        int b= scan.nextInt();//end
        for(int k=a;k<=b;k++){
            int sum=0;
            int pro=1;
            int temp1=k;
            while(temp1!=0){
                int last=temp1%10;//3
                sum=last+sum;
                pro=last*pro;
                temp1/=10;
            }
            if(sum==pro){
                System.out.println("Spy number = "+k);
            }
        }
    }
}
