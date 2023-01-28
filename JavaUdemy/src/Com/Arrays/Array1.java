package Com.Arrays;
import java.util.*;

public class Array1 {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        int size= scan.nextInt();
        int[] get =getIntegers(size);
        System.out.println("Original array ");
        System.out.println(Arrays.toString(get));
        print(get);
        System.out.println("Sorted array");
        int[] sort=sort(get);
        System.out.println(Arrays.toString(sort));
        print(sort);
    }
    public static int[] getIntegers(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the value = "+i);
            arr[i]=scan.nextInt();
        }
        return arr;
    }

    public static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
           System.out.println("Element at index "+i+" = "+arr[i]);
       }
    }

    public static int[] sort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr;
    }
}
