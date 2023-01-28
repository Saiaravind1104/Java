package com.package1;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        int rev1=Integer.MAX_VALUE;
      for(int i=a;i!=0;i/=10){
          ++count;
      }
      int[] arr=new int[count];
      int num=count-1;
      for(int i=a;i!=0;i/=10){
          int last=i%10;
          arr[num--]=last;
      }
      int temp;
     for(int i=0;i<3;i++){
         for(int j=i+1;j<3;j++){
             if(arr[i]>=arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
         }
     }
     int sum=0;
     for(int i=0;i<3;i++){
         sum=sum*10+arr[i];
     }
        System.out.println(sum);


    }
}
