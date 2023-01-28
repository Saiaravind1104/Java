package com.package1;

public class w {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;

    }
    public static void main(String[] args) {
        int c=10;
        int d=20;
        System.out.println(c+"        "+d);
        swap(c,d);
        System.out.println(c+"        "+d);
    }
}
