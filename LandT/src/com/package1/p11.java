package com.package1;

public class p11 {
    public static void main(String[] args) {
        int space=4;
        int stars=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("X");
            }if(i>4){
                space++;
                stars--;
            }else{
                space--;
                stars++;
            }
            System.out.println();
        }
    }
}
