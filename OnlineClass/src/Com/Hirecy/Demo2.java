package Com.Hirecy;

import java.util.Scanner;

public class Demo2 {
    public static int totalTrees(int input1,int input2){
        int temp=(input1+1)%input2;//3
        int result=temp-1;
        int count=1;
        for(int i=0;i<=result;i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int temp=totalTrees(1,2);
        System.out.println(temp);
    }
}
