import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int count=0;
        for(int i=1;i<N;i++){
            if(N%i==0){
                count+=i;
            }
        }if(count==N){
            System.out.println(1);
        }else{
            System.out.println(count);
        }
    }
}
