import java.util.Scanner;
public class CustomerId
  {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
       int[] arr=new int[4];
       for (int i=0;i<4;i++)
       {
           arr[i]=scan.nextInt();
       }
       for (int j=0;j<4;j++)
       {
           int sum=0;
           while (arr[j]!=0)
           {
               int last=arr[j]%10;
                sum+=last;
             arr[j]/=10;
           }
           System.out.println(sum);
       }


    }
}
