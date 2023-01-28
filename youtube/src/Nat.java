import java.util.Scanner;
public class Nat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting value  = ");
        int m=s.nextInt();
        System.out.println("Enter the end value = ");
        int n=s.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=m;i<=n;i++){
            sum1+=i;
        }
        System.out.println("Sum of Natural numbers from "+m+" to "+n+" = "+sum1);
        for(int j=1;j<sum1;j++){
            if(sum1%j==0){
                sum2=(sum2+j);
            }
        }
        System.out.println("Sum of Factors = "+sum2);
        if(sum2==sum1){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect Number");
        }
    }
}
