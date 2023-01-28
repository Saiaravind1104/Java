package com.package1;

import java.util.Scanner;

public class binarySearch {
    public static Scanner s=new Scanner(System.in);
    public static int[] user(){
        System.out.println("Enter the size of the array = ");
        int b=s.nextInt();
        int[] arr=new int[b];
        for(int i=0;i<b;i++){
            System.out.println("Enter the value for index "+i+" = ");
            arr[i]=s.nextInt();
        }return arr;

    }
    public static int binarySearch(int arr[],int num){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<num){
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else{
                return mid;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] array=user();
        System.out.println(binarySearch(array,4));
    }
}
