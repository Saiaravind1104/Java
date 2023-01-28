import java.util.Arrays;
import java.util.Scanner;

public class Temperature {
    public static void temp(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int size= arr.length;
        if(size<3)
        {
            System.out.println(arr[size-1]);
        }
        else
        {
            System.out.println(arr[size-2]);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        temp(arr);
    }
}
