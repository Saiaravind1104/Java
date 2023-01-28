import java.util.Scanner;
public class mountblue {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int j=0;j<size;j++)
        {
            int sum=0;
            while (arr[j]!=0)
            {
                int lastDigit=arr[j]%10;
                sum=sum+lastDigit;
                arr[j]=arr[j]/10;
            }
            System.out.print(sum+" ");
        }
    }
}

