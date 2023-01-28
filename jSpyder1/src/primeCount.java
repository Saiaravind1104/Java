import java.util.Scanner;

public class primeCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0;
        for(int i=2;i<=a;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   count++;
                }
            }if(count==0){
                for(int m=a;m!=0;m/=10){
                    int b=m%10;
                    if(i==b){
                        sum+=b;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
