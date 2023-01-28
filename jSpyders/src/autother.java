import java.util.Scanner;

public class autother {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the autother = ");
        int T=s.nextInt();
        int temp=9;
        int temp1=9;
        int temp2=9;
        for(int i=1;i<=T;i++){
            System.out.println("Coins for each authoer = ");
            int c=s.nextInt();
            System.out.println("Type of auther = "); // 1- transalator// 2-writer// 3-both
            int d=s.nextInt();
            if(d==1){//1
                int x=d*c;// 2*3 =6
                if(temp>x){ //9>6
                    temp=x;
                }
            }
            if(d==2){
                int y=d*c;
                if(temp1>y){
                    temp1=y;
                }
            }
            if(d==3){
                int z=d*c;
                if(temp1>z){
                    temp2=z;
                }
            }

        }


    }
}
