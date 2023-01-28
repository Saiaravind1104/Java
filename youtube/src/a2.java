import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting number = ");
        int m=s.nextInt();
        System.out.println("Enter the ending number = ");
        int n=s.nextInt();
        for(int i=m;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((j*j)==i){
                    System.out.println(i);
                }
            }

        }
    }
}
