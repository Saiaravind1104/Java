import java.util.ArrayList;
import java.util.Scanner;

public class sai1 {
    public static int equilibrium(int arr[], int n)

    {

        int i, j;

        int leftsum, rightsum;



        for (i = 0; i < n; ++i) {




            leftsum = 0;

            for (j = 0; j < i; j++) {

                leftsum += arr[j];
            }
            rightsum = 0;

            for (j = i + 1; j < n; j++) {

                rightsum += arr[j];
            }

            if (leftsum == rightsum) {

                return arr[i];
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        int c=equilibrium(arr,a);
        if(c>=0){
            System.out.println(c);
        }else{
            System.out.println("No Equilibrium element found");
        }
    }
}
