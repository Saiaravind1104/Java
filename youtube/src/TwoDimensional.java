import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int [][] arr=new int [3][4];
       for (int i=0;i<3;i++)
       {
           for (int j=0;j<4;j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
       for (int k=0;k<3;k++)
       {
           int temp=arr[k][0];
           for (int l=0;l<4;l++)
           {
               if (arr[k][l] > temp)
               {
                  temp=arr[k][l];
               }
           }
           System.out.println(temp);

       }



    }
}
