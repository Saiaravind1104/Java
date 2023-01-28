package com.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int count=0;
        int flag=0;
        int[] arr={10,20,20,30,30,30};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag++;
                }
            }
            if(flag<=2){
                arr[i]=0;
            }else{
                count++;
            }
        }
        for(int val:arr){
            System.out.println(val);
        }
        System.out.println(count);
    }
}
