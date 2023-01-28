import java.util.Scanner;
public class stockPrice {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of iterartions = ");
        int T=s.nextInt();
        for(int i=1;i<=T;i++){
            System.out.println("price of stock");
            int S=s.nextInt();//price of stock
            System.out.println("Starting range");
            int A=s.nextInt();//Starting range
            System.out.println("Ending range");
            int B=s.nextInt();//Ending range
            System.out.println("percentage");
            int C=s.nextInt();//percentage
//bscilfd
            float n=(float)C/100;
            System.out.println("Percentage = "+n);
            double f=(double)(S+(S*n));// 100 to 200 150>=100 150<=200
            System.out.println("price after percentage = "+f);
            if((f>=A)&&(f<=B)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }//100 93 108 7
        }s.close();
    }
}
