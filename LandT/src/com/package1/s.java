package com.package1;

public class s {
    public static void input(int a){
        if(a>5){
            return;
        }
        System.out.println(a);
        input(a+1);
    }
    public static void main(String[] args) {
        input(1);
    }
}
