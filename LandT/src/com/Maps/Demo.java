package com.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        char ch='1';
        String str=String.valueOf(ch);
        Integer a=Integer.parseInt(str);
        System.out.println(a);
        Map<Character,Integer> map1=new LinkedHashMap<>();
        map1.put('a',10);
        map1.put('x',70);
        map1.put('y',60);
        map1.put('q',15);
        map1.put('x',300);
        System.out.println(map1);
    }
}
