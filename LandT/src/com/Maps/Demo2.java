package com.Maps;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,2,4,5,6,2};
        int[] arr2={4,5,2,10,4};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int res=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                res++;
                set.remove(arr1[i]);
            }
        }
        System.out.println(res);
    }
}
