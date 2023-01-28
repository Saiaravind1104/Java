package com.arrays;

public class OnesCount {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,1,1};
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j< arr.length;j++){
                if(arr[j]==1){
                    count++;
                }else{
                    break;
                }
                res=Math.max(count,res);
            }
        }
        System.out.println(res);
    }
}
