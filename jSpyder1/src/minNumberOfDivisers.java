import java.util.Scanner;

public class minNumberOfDivisers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            int small=Integer.MAX_VALUE;
            int c=s.nextInt();
            for(int j=1;j<=c;j++){
                int minCount=0;

                boolean status=false;
                if(c%j==0){
                   for(int m=1;m<=j;m++){
                       if(j%m==0){
                           minCount++;
                           status=true;
                       }
                   }if(minCount==4){

                        int b=c/j;

                        for(int n=1;n<=b;n++) {
                            if (b % n == 0) {
                                int count = 0;
                                for (int v = 1; v <= n; v++) {
                                    if (n % v == 0) {
                                        count++;
                                    }
                                }
                            if(count<=small){
                                small=count;
                            }

                            }
                        }


                    }

                }


            }
            System.out.println(small);
        }
    }
}
