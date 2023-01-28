import java.util.Scanner;

public class DeleteElemetFromAnArray {
    public static Scanner s=new Scanner(System.in);
    public static int[] input(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }return arr;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] delete(int[] arr,int num){
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=num){
               continue;
            }
            else{

                for(int j=i;j< arr.length-1;j++){
                    arr[j]=arr[j+1];
                }arr[arr.length-1]=0;
            }
        }

        return arr;

    }
    public static void main(String[] args) {
        int[] temp=input(5);
        System.out.println("Orginal Array");
        display(temp);
        temp=delete(temp,5);
        System.out.println();
        System.out.println("After Delete");
        display(temp);
    }
}
