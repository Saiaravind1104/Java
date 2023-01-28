import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int clients= scan.nextInt();
        int[] arr=new int[clients];
        for(int i=0;i<clients;i++){
            arr[i]= scan.nextInt();
        }

        for(int i=0;i<clients;i++){
            int sum=0;
            for(int j=arr[i];j!=0;j/=10){
                int last=j%10;
                sum+=last;
            }
            System.out.print(sum+" ");
        }

    }
}
