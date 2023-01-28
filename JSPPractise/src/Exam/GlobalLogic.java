package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class GlobalLogic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int[][] arr=new int[size][2];
        for(int i=0;i<size;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i][0]==arr[j][1]){
                    count++;
                }
            }
            if(count==0){
                list1.add(arr[i][0]);
            }else if(count==1){
                list2.add(arr[i][0]);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
