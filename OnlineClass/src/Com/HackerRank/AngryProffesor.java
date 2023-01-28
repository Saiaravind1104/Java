package Com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class AngryProffesor {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int att= scan.nextInt();
        for(int i=0;i<size;i++){
            list.add(scan.nextInt());
        }
        int count=0;
        for(int i=0;i<size;i++){
            int temp=list.get(i);
            if(temp<=0){
                count++;
            }
        }
        if(count>=att){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
