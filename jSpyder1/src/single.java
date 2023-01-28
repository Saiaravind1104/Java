import java.util.Scanner;

public class single {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int numCount=0;
        System.out.print("Factors: ");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=a;i!=0;i/=10){
            numCount++;
        } System.out.println("Total digits = "+numCount);
    }
}
