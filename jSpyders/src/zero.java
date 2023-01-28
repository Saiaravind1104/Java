import java.util.Scanner;
public class zero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        for(int i=a;i!=0;i/=10){
            int b=i%10;

            if(b==0){
                count++;
            }
        }if(count==0){
            System.out.println(false);

        }else{
            System.out.println(true);
        }

    }
}
