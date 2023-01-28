import java.util.Scanner;

public class SecondLargestElement {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }return arr;
    }
    public static int Secondlargest(int[] arr){
        int size= arr.length;
        int store=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr[1];
    }
    public static void main(String[] args) {
        int[] temp=input(5);
        int a=Secondlargest(temp);
        System.out.println(a);

    }
}
