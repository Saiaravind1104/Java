package com.package2.mock1;

public class Palandrome5s {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i>=0;i++){
            int temp=0;
            boolean status=false;
            for (int j=i;j!=0;j/=10){
                int last=j%10;
                temp=temp*10+last;
                if(temp==5){
                    status=true;
                }
            }
            if(temp==i && status==true){
                System.out.println(i);
                count++;

            }
            if (count==10){
                break;
            }

        }

    }
}
