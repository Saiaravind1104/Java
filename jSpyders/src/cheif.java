import java.util.Scanner;

public class cheif {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            int N=s.nextInt();
            for(int j=1;j<=N;j++){
                for(int m=1;m<=N;m++){
                    for(int n=m*j;n<(m*j)+1;n++){
                        System.out.print(n);
                    }
                }
                System.out.println();
            }
        }
    }
}
