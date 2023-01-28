package com.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr={10,10,20,30,40,20,30};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        for(Map.Entry<Integer,Integer> h:map.entrySet()){
            System.out.println(h.getKey()+": "+h.getKey());
        }
    }
}
