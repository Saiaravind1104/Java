package Com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        for(int i=0;i<size;i++){
            list.add(scan.nextInt());
        }
        for(int i=0;i<size;i++){
            int temp=list.get(i);
            for(int j=0;j<size;j++){
                int temp1=list.get(j);
                if(temp>temp1){
                   list1.add(temp);
                   list.remove(temp1);

                }
            }
        }
        System.out.println(list1);
    }
}
