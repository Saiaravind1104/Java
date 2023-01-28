import java.util.Scanner;

public class BiggestElementInArray {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }return arr;
    }
    public static int big(int[] arr){
        int big=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];

            }
        }
        return big;
    }
    public static void main(String[] args) {
        int[] temp=input(5);
        int a=big(temp);
        System.out.println("Biggest Element = "+a);

    }
}
