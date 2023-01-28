package com.package1;

public class p10 {
    public static void main(String[] args) {
        int stars=1;
        int space=4;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("X ");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if(i>3){
                stars--;
                space++;
            }else{
                stars++;
                space--;
            }
            System.out.println();
        }
    }
}
