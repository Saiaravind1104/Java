package com.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class highest {
    public static void main(String[] args) {
        int a=132;
        int sum=0;
        int temp=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=a;i!=0;i/=10){
            int last=i%10;
            arr.add(last);
        }
        Collections.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.size();i++){
           sum=sum*10+arr.get(i);
        }
        System.out.println(sum);

    }
}
