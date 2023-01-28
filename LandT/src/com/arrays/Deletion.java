package com.arrays;

public class Deletion {
    public static void main(String[] args) {
        //{3,8,12,5,6}
        //
        int arr[]={3,8,12,5,6};
        int del=12;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==del){
                index=i;
            }
        }
        for(int i=index;i<arr.length;i++){
            if(i!= arr.length-1){
                arr[i]=arr[i+1];
            }
        }
        arr[arr.length-1]=0;
        for(int var:arr){
            System.out.println(var);
        }

    }
}
