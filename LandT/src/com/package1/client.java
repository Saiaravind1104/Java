package com.package1;

import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            int b=s.nextInt();
            arr[i]=b;
        }
        int max=0;
        for(int i=0;i<a;i++){
            int b=arr[i];
            for(int j=1;j<b;j++){
                if((arr[i]%j)==0){
                    System.out.println(j);
                }
            }
            //System.out.print(max+" ");
        }
    }
}
