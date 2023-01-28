package com.package1;

import java.util.Scanner;

public class dic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] b=str.split(" ");
        int len=b.length;
      //  System.out.println(len);

        for(int i=0;i< len;i++){
            int count=0;
            for(int j=0;j<len;j++){

                if(b[i]==b[j]){
                    count++;
                }

            }
            System.out.println(count);
        }

    }
}//cat matter latt matter cat matter cat
