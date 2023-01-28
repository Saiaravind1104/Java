import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();
        int[] arr=new int[len];
        int k=0;
        while(k<arr.length){
            arr[k]=scan.nextInt();
            k++;
        }
        int n=0;
        while(n< arr.length){
            arr[n]=arr[n]*arr[n];
            n++;
        }
        int i=0;
        while(i<arr.length){
            int temp=arr[i];
            int j=0;
            while(j< arr.length){
                if(temp<arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
                j++;
            }
            i++;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
