package com.Maps;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        int[] arr={10,20,30,40,40,20};
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
        System.out.println(hash.size());
    }
}
