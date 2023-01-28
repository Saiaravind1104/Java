import java.util.Scanner;

public class formBigNumber {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(){
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            int num=s.nextInt();
            arr[i]=num;
        }return arr;
    }
    public static void check(int[] ar){
        int sum=0;
        int[] arr=new int[ar.length+1];
        for(int i=0;i<ar.length;i++){
            arr[i]=sum;
            sum=0;
            for(int j=0;j<ar.length;j++){
               if(i==j){
                   continue;
               }
            }

        }
    }
    public static void main(String[] args) {
        int[] in=input();
        check(in);
    }
}
