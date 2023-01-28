package com.package1;

public class swap {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        int num=10;
        for(int i=0;i<arr.length;i++){
            arr[i]=num;
            num+=10;
        }
        swap(arr,4,1);

        for(int val:arr){
            System.out.println(val);
        }






    }
}
