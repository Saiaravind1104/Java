import java.util.Scanner;
public class ar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number values you want to store = ");
        int x=s.nextInt();
        int a[]=new int[x];

        int sum=0;
        for(int i=0;i<=x-1;i++){
            System.out.println(i+" index = ");
            int b=s.nextInt();

            a[i]=b;
        }

        for(int j=0;j<=x-1;j++){
            sum+=a[j];
        }
        System.out.println(sum);


    }
}
