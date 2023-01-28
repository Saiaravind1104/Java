package Com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        ArrayList<Integer> list=new   ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int rev=scan.nextInt();
        int charge= scan.nextInt();

        int sum=0;
        for(int i=0;i<size;i++){
            list.add(scan.nextInt());
        }
        for(int i=0;i<list.size();i++){
            if(rev!=i){
                sum+= list.get(i);
            }

        }
        int div=sum/2;
        if( charge==div){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(charge-sum);
        }
    }
}
