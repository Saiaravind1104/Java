package com.package1;

public class Pattreans {

    public static void main(String[] args) {
        int a=7;
        int temp=a-1;
        int col=a+temp;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=col;j++){
                if(i+j==a+1){
                    System.out.print("X ");
                }else if(j-i==a-1){
                    System.out.print("X ");
                }else if(i==a){
                    System.out.print("X ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
