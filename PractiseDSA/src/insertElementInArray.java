import java.util.Scanner;

public class insertElementInArray {
    public static Scanner s=new Scanner(System.in);

    public static int[] input(){
        int[] arr=new int[5];
        for(int i=0;i<3;i++){
            int a= s.nextInt();
            arr[i]=a;

        }return arr;
    }
    public static int[] insert(int[] a,int b,int currentStatus,int element)
    {
        int size=a.length;
        if(currentStatus>size)
        {
            return a;
        }else
        {
            int index=b-1;
            for(int i=a.length-1;i>index;i--)
            {
                int temp=a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
            a[index]=element;

        }return a;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        int[] temp=input();
        System.out.println("Original Array :- ");
        display(temp);
        int position=1;
        int currentStatus=3;
        int insert=10;
        System.out.println();
        temp=insert(temp,position,currentStatus,insert);
        System.out.println("After inserting element");
        display(temp);
    }
}
