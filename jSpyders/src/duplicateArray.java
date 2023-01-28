import java.util.Scanner;

public class duplicateArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int arr[]=new int[T];
        for(int i=0;i<T;i++){
            int a=s.nextInt();
            arr[i]=a;

        }
        for(int i=0;i<T;i++){

            for(int j=i+1;j<T;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }

        }

    }
}
