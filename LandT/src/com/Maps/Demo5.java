package com.Maps;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo5 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(30,2);
        map.put(10,1);
        map.put(20,2);

        map.put(10,2);
        System.out.println(map);
    }
}
