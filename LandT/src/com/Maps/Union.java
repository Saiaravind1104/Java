package com.Maps;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1={10,10,15,20,41};
        int[] arr2={10,20,30,41,15};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
