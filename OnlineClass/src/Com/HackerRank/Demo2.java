package Com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<Integer>();
        int len=scan.nextInt();
        for(int i=0;i<len;i++){
            int store=scan.nextInt();
            li.add(store);
        }
        int max=0;
        int min=0;
        int small=li.get(0);
        int big=li.get(0);

            for(int j=0;j<len;j++){
                if(small>li.get(j)){
                    small=li.get(j);
                    min++;
                }
                if(big<li.get(j)){
                    big=li.get(j);
                    max++;
                }
            }
        System.out.print(max+" "+min);


    }
}
