package com.package1;

public class l {
    public static void main(String[] args) {
        String s="ffillltttteeeeerreddd";
        String temp=s;
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i]=ch;

        }for(int i=0;i< arr.length;i++){
            int count=1;
            char c=arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(c==arr[j]){
                    count++;
                }else{
                    System.out.println("i = "+i);
                    System.out.println("j = "+j);
                    break;

                }
            }
            System.out.println(arr[i]+"    "+count);
        }
    }
}
