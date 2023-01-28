package com.package2.mock1;

import java.util.Scanner;

public class Paliandrome {
    public static int digitCheck(int val){
        int num=0;
        for(int i=val;i!=0;i/=10){
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
            for(int i=0;i>=0;i++){
                int temp=0;
                for(int j=i;j!=0;j/=10){
                    int last=j%10;
                    temp=temp*10+last;
                }
                if(temp==i){

                    int a=digitCheck(i);
                    if(a==4){
                        break;
                    }else{
                        System.out.println(i);
                    }
                }


        }
    }
}
