import java.util.Scanner;
public class prim1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=s.nextInt();
        int count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }
        }if(count==0){
            System.out.println("Prime number = "+a);
        }else{
            System.out.println("Not a prime number = "+a);
        }
    }
}
