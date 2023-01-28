import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class java1 {
    /* package codechef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of iterartions");
        int T=s.nextInt();

        for(int i=1;i<=T;i++){
            boolean status =false;
            int pro=1;
            int temp=0;
            System.out.println("Enter number of models = ");
            int N=s.nextInt();//number of models;
            System.out.println("Enter budget = ");
            int B=s.nextInt();//budget
            for(int j=1;j<=N;j++){

                System.out.println("Width = ");
                int W=s.nextInt();
                System.out.println("Hight = ");
                int H=s.nextInt();
                System.out.println("price = ");
                int P=s.nextInt();
                pro=W*H;//1 10 4
                if((pro>temp)&&(B>=P)){
                    temp=pro;
                    status=true;
                }
            }if(status==true){
                System.out.println(temp);
            }else{
                System.out.println("no tablet");
            }

        }
    }
    }


