import java.util.Scanner;

public class specialShop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            int N=s.nextInt();
            int A=s.nextInt();
            int B=s.nextInt();
            int lowAmount=0;
            int sum=0;
            for(int m=0;m<=N;m++){
               int x=0;
                for(int j=1;j<=N;j++){

                    if(m+j==N){
                        x=(int)((Math.pow(m,2)*A)+(Math.pow(j,2)*B));
                        System.out.println(x);
                        if(lowAmount>x){
                            lowAmount=x;
                        }

                    }

                }

            }System.out.println(lowAmount);
        }
    }
}
