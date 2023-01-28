package com.package1;

public class p9 {
    public static void main(String[] args) {
       int space=2;
       int stars=1;
       for(int i=1;i<=5;i++){
           for(int j=1;j<=space;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=stars;j++){
               System.out.print("X");
           }
           System.out.println();
           if(i>=3){
               space++;
               stars-=2;
           }
           space--;
           stars+=2;
       }


    }
}
