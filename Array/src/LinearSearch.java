import java.util.Scanner;

public class LinearSearch {
    public static Scanner s=new Scanner(System.in);
    public static int[] user(){
        System.out.println("Enter the size of the array ");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the value for index "+i+" = ");
            int b=s.nextInt();
            arr[i]=b;
        }return arr;
    }
    public static int search(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }return -1;
    }
    public static void display(int[] arr){
        for(int val:arr){
            System.out.println(val);
        }



    }
    public static void main(String[] args) {
        int[] array=user();
        display(array);
       int b= search(array,20);
        System.out.println("Search result = "+b);
    }
}
