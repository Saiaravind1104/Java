import java.util.Scanner;

public class SecondLargestElement2ndMethod {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }return arr;
    }
    public static int secondLargest(int[] arr){
        int a=arr[0];
        int second=0;
        for(int i=1;i< arr.length;i++){
           if(arr[i]>a){
               a=arr[i];
           }

        }return arr[1];
    }
    public static void main(String[] args) {
int[] temp=input(5);
int a=secondLargest(temp);
        System.out.println(a);

    }
}
