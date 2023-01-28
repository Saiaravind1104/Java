import java.util.Scanner;
public class smallnumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the value");
        for (int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<size;i++)
        {
            int sum = 0;
            while (arr[i] != 0)
            {
                int last = arr[i] % 10;
                sum += last;
                arr[i] /= 10;
            }
           arr[i]=sum;
        }
            for (int k=0;k<size;k++)
            {
                for (int l=k+1;l<size;l++)
                {
                    if (arr[k]>arr[l])
                    {
                        int temp=arr[k];
                        arr[k]=arr[l];
                        arr[l]=temp;
                    }
                }
            }

        for (int var:arr)
        {
            System.out.println(var);
        }






    }
}
