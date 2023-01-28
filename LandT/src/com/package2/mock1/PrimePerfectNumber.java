package com.package2.mock1;

public class PrimePerfectNumber {
    public static int checkPerfect(int val){
        int sum=0;
        for(int i=1;i<val;i++){
            if(val%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i>=0;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }

            if(count==2){
                num++;
            }
            if(num==10){
                int last=i%10;
                int temp=checkPerfect(last);
                if(temp==last){
                    System.out.println("Perfect number = "+i);
                }else{
                    System.out.println("Not a perfect number = "+i);
                }
                break;
            }
        }
    }
}
