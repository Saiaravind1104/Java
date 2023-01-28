import java.util.Scanner;

public class single {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int count=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<i;j++){
                count++;
            }

        }System.out.println(count);


    }
}
