import java.util.LinkedList;
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l1=scan.nextInt();
        int l2=scan.nextInt();
        int size=0;
        if(l1<l2){
            size=l2;
        }else{
            size=l1;
        }
        int[] arr=new int[l1];
        int[] arr1=new int[l2];

        for(int i=l1-1;i>=0;i--){
          arr[i]=scan.nextInt();
        }
        for(int i=l2-1;i>=0;i--){
            arr1[i]=scan.nextInt();
        }



        int[] add=new int[size];
        for(int i=size-1;i>=0;i--){
            add[i]=arr[i]+arr1[i];
        }
        for(int val:add){
            System.out.print(val+" ");
        }


    }
}
