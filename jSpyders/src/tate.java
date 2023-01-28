import java.util.Scanner;

public class tate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number of iterartions = ");
        int a=s.nextInt();
        boolean status=false;
        for(int i=1;i<=a;i++){
            System.out.println("Maximum comibations = ");
            int b=s.nextInt();
            System.out.println("Maximum sum = ");
            int c=s.nextInt();
            int y=0;
            int z=0;
            int x=0;
            for(int j=1;j<=b;j++){
                for(int m=0;m<=b;m++){
                    x=j+m;
                    if(c==x){
                        y=Math.abs(j-m);
                        if(z<y){
                            z=y;
                            status=true;
                        }
                    }
                }
            }if(status){
                System.out.println(z);
            }
        }
    }
}
