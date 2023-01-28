package com.package1;

import java.util.Scanner;

public class stock {
    public static int smallestStockPrice(int[] stock,int valueK){
        int answer=0;
        for(int i=0;i<stock.length;i++){
            for(int j=i+1;j<stock.length;j++){
                if(stock[i]>stock[j]){
                    answer=stock[i];
                    stock[i]=stock[j];
                    stock[j]=answer;
                }
            }
        }
        int x=stock[valueK-1];
        return x;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int stock_size=s.nextInt();
        int[] stock=new int[stock_size];
        for(int i=0;i<stock_size;i++){
            int b=s.nextInt();
            stock[i]=b;
        }
        int valueK=s.nextInt();
        int result=smallestStockPrice(stock,valueK);
        System.out.println(result);

    }
}
