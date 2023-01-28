package com.package1;

public class q {
    public static void input(int a){
        if(a<1){
            return;
        }
        System.out.println(a);
        input(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
input(10);
    }
}
