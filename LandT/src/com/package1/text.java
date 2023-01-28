package com.package1;

public class text {
    public static void main(String[] args) {
        String s="aa a234bc@ sad$ hsagd^";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(((ch>=33)&&(ch<=47))||((ch>=58)&&(ch<=64))||((ch>=91)&&(ch<=96))){
                count++;
            }
        }
        System.out.println(count);
    }
}
