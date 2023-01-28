import java.util.Scanner;

public class slefTraing {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            int N=s.nextInt();
            int count=0;
            for(int j=1;j<=N;j++){
                int a=s.nextInt();//11
                System.out.println(a);
                if((a>=10)&&(a<=60)){
                    System.out.println("count = "+a);
                    count++;
                }
            }System.out.println(count);
        }
    }
}
