import java.util.Arrays;
import java.util.Scanner;

public class UniqueVlaues {
    int a=10;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            System.out.println(i+" "+ Arrays.toString(arr));
        }
                //{1,2,3,5,3,5};
        for(int i=0;i< arr.length;i++){
            boolean status=true;
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                   if(count>1){
                       status=false;
                       break;
                   }

                }
            }if(status){
                System.out.println(arr[i]);
            }
        }
    }
}
