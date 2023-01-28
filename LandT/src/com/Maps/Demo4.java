package com.Maps;

import com.package1.arr1;

import java.util.HashSet;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr={3,4,-3,-1,1};
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int pre=0;
        for(int i = 0; i< arr.length; i++){
            sum+=arr[i];
            if(sum==pre){
                System.out.println(true);
            }
            if(set.contains(pre-sum)){
                System.out.println(true);
            }


            set.add(sum);
        }
        System.out.println(set);
    }
}
