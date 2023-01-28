package com.package2.mock2;

public class Demo1 {
    public static void main(String[] args) {

        String a="i am sai aravind";
        String[] arr=a.split(" ");
         for(String val:arr){
            System.out.println(val);
         }
        String b="sai";
        String c="sai";

        System.out.println(b.equals(c));
        System.out.println(a.contains(b));
        int res=b.compareTo(a);
        if(res==0){
            System.out.println("same");
        }else if(res>0){
            System.out.println("s1");
        }else if(res<0){
            System.out.println("s2");
        }

    }
}
