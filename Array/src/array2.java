import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr =new int[5];
        int b=0;
        int sum=0;
        for(int i=0;i<5;i++){//0 1 2 3 4
            arr[i]=b++;
        }
        for(int val:arr){
            sum+=val;
        }
        System.out.println(sum);
    }
}
