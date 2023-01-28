package Array1;

import java.util.Scanner;

public class A1 {
    public static int[] evenCheck(int[] a){
        int len=a.length;
        int[] temp=new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            if(a[i]%2==0){
                temp[count]=a[i];
                count++;
            }
        }return temp;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        int[] v=evenCheck(arr);
        for(int i=0;i<size;i++){
            if(v[i]==0){
                break;
            }
            if(v[i]%2==0 && v[i]!=0){
                int a=v[i];
                int rev=0;
                for(int k=a;k!=0;k/=10){
                    int last=k%10;
                    rev=rev*10+last;
                }
                if(rev==a){
                    System.out.println(a+" palamdrome");
                }
            }
        }
    }
}
