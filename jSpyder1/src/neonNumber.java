import java.util.Scanner;

public class neonNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int sum=0;
        boolean status =false;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        int j=sum*sum;
        int total=0;
        for(int i=sum;i!=0;i/=10){
            int last=i%10;
            total+=last;
        }

        if(total==sum){
            System.out.println("Neon number");
        }else{
            System.out.println("Not a neon number");
        }
    }
}
