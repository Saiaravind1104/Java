package com.package1;

public class recPrime {
    public static int prime(int a,int b){

        if(a<=b){
            int count=0;
          for(int i=2;i<b;i++){
              if(b%i==0){
                  count++;
              }
          }if(count==0){
              if(b==1){
                  return b-1;
            }else{
                  return b+prime(a,b-1);
              }
            }else{
                return prime(a,b-1);
            }
        }else {
            return b;
        }

    }
    public static void main(String[] args) {
        System.out.println(prime(1,100));
    }
}
