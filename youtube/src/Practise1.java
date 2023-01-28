import java.util.Scanner;

public class Practise1 {
    public static Scanner scan=new Scanner(System.in);
    public static int[] intitial(int size,int[] arr){

        for(int i=0;i<size;i++){
            System.out.println("Enter the value at index "+i);
            arr[i]= scan.nextInt();
        }
        return arr;
    }
    public static void display(int size,int[] arr){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        int size=scan.nextInt();
        int[] arr=new int[size];
        int[] temp=intitial(size,arr);
        display(size,temp);



    }
}
