package com.package1;

public class Odd {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){
                if(count%2==0){
                    System.out.println(i);
                }
                count++;
            }
        }
    }
}

