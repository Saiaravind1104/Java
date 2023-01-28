package Com.Arrays;
import java.util.*;
public class MinimumValue {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int size= scan.nextInt();
        int[] original =readIntegers(size);
        System.out.println("Orginal Array");
        System.out.println(Arrays.toString(original));
        System.out.println("Minimum value :- "+minimumValue(original));
    }
    public static int[] readIntegers(int size){
        int[] arr=new int[size];
        int a=0;
        for(int i=0;i<size;i++) {
            System.out.println("Enter the element "+(a++)+" = ");
            arr[i]=scan.nextInt();
        }return arr;
    }
    public static int minimumValue(int[] arr){
        int temp=arr[0];
        for(int i=0;i< arr.length;i++){
            if(temp>arr[i]){
                temp=arr[i];
            }
        }return temp;
    }
}
