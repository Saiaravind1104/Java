package com.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={10,5,7,30};
        //30,7,5,10
        int high= arr.length-1;
        int low=0;
        while(high>low){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            high--;
            low++;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
