package com.jspydertest;
class A{
    public void name(String n){
        System.out.println(n);
    }
    public void print(int a,int b){
        System.out.println(a+b);
    }
}
class B extends A{
    public void print(int c,int d){
        System.out.println(c-d);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b1=new B();
        b1.print(1,2);
        b1.name("Vaishu");
    }
}
