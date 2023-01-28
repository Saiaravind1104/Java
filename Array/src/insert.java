import java.util.Scanner;

public class insert {
    public static int[] input(int[] arr,int size,int value,int position,int capacity){
        if(size==capacity){
            return arr;
        }
        int index=position-1;
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=value;
        return arr;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("At index "+i+" = "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<4;i++){
            arr[i]=s.nextInt();
        }
        int[] a=input(arr,5,4,2,6);
        display(a);
    }
}
