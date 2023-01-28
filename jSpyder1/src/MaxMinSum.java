import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int sum=0;
        int small=Integer.MAX_VALUE;
        int big=0;
        for(int i=0;i<a;i++){
            int c=s.nextInt();
            b[i]=c;
        }
        int d=s.nextInt();
        int[] e=new int[d];
        for(int i=0;i<d;i++){
            int c=s.nextInt();
            e[i]=c;
        }

        for(int i=0;i<a;i++){
            if(b[i]>big){
                big=b[i];
            }
        }
        for(int i=0;i<a;i++){
            if(e[i]<small){
                small=e[i];
            }
        }
        System.out.println("Big = "+big);
        System.out.println("Small = "+small);
        System.out.println(big+small);
    }
}
