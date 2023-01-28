import java.sql.SQLOutput;
import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number = ");
        int a=s.nextInt();
        System.out.println("Enter the count value = ");
        int b=s.nextInt();
        int c=0;
        int d=1;
        int e=0;
        int count=2;
        int x=0;
       int count1=0;
       int r=0;
        for(int i=3;i<=a;i++){
            e=c+d;
            c=d;
            d=e;
            count++;

             if(count==b){
                for(int j=1;j<=e;j++){
                    if(e%j==0){
                        count1++;
                        x=e;
                        break;
                    }else{
                        x=e;
                    }
                }
            }else {
                 if (b == 1) {
                     r = 1;

                 }
                 if (b == 2) {
                     r = 2;

                 }
             }
        }if(count==2){
            System.out.println("Prime number = "+x);
        }else if(r==1){
            System.out.println("Not a prime number = "+0);
        }else if(r==2){
            System.out.println("Not a Prime number = "+1);
        }else {
            System.out.println("Not a prime number = "+x);
        }
    }
}
