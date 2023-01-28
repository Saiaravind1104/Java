import java.util.Scanner;

public class love {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            int N=s.nextInt();
            int X=s.nextInt();
            int K=s.nextInt();
            int count=0;
            int temp=0;
            for(int j=1;j<=N;j++){
                int A=s.nextInt();
                int B=s.nextInt();


                int c=Math.abs(A-B);
                if(c<=K){
                    count++;
                }


            }
            if(count>=X){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
