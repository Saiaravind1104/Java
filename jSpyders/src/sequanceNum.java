import java.util.Scanner;

public class sequanceNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();

        int[] arr=new int[T];
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            arr[i]=N;
        }
        for(int j=0;j<T;j++){
            if(arr[j]%2==0){
                System.out.print(arr[j]+" ");
            }
        }for(int j=0;j<T;j++){
            if(arr[j]%2==1){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
