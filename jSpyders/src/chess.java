import java.util.Scanner;

public class chess {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of iterartions = ");
        int T=s.nextInt();
        int step=0;
        int row=1;
        for(int i=1;i<=T;i++){
            System.out.println("Enter start i = ");
            int A=s.nextInt();
            System.out.println("Enter start j = ");
            int B=s.nextInt();
            System.out.println("Enter end i = ");
            int C=s.nextInt();
            System.out.println("Enter end j = ");
            int D=s.nextInt();
            if((A==C)&&(B==D)){

                System.out.println(0);
            }else if((A==C)&&(B!=D)){
                System.out.println(1);

            }else if((A!=C)&&(B==D)){
                System.out.println(1);

            }
            else{
                System.out.println(2);
            }
        }
    }
}
