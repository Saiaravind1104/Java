import java.util.Scanner;

public class nearestValueOf2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
         long temp=0;
        for(int i=1;i<=a;i++){
            long  b=(long)Math.pow(2,i);
            if(b<=a){
                temp=b;
            }
        }
        System.out.println(temp);
    }
}
