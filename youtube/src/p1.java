import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        //write a program to check
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number 1 = ");
        int m=s.nextInt();
        System.out.println("Enter the number 2 = ");
        int n=s.nextInt();

        long pro=1;
        int sum=0;
        for(int i=m;i<=n;i++){
            pro=pro*i;

        }
        System.out.println("Product = "+pro);
        for(int j=1;j<pro;j++){
            if(pro%j==0){
                sum+=j;
            }
        }
        System.out.println("sum = "+sum);
        if(sum==pro){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect Number");
        }
    }
}
