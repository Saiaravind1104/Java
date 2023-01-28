package com.package1;

public class p4 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i+j==5)&&((j==1)||(j==3))) {
                    System.out.print("!");
                }else if ((i+j==5)&&((j==2))) {
                    System.out.print("@");
                }else if((i+j==5)&&((j==4))) {
                    System.out.print("com.package1.a");

                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
