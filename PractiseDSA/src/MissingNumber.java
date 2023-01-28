import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        int num=1;
        int temp=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int j=1;j<=10;j++){
           boolean flag=false;

            for(int i=0;i < arr.length ; i++){
                if(j==arr[i]){
                    flag=true;

                }

            }if(flag==false){
                System.out.println(j);
            }
        }

    }
}
