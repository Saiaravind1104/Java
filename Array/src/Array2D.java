import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int[][] arr=new int[a][b];
        int[] store=new int[a];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=scan.nextInt();
            }

        }
        for(int i=0;i<a;i++){
            int temp=arr[i][0];
            for(int j=0;j<b;j++){
                if(temp<arr[i][j]){
                    temp=arr[i][j];
                }
            }
            store[i]=temp;
        }
        for(int val:store){
            System.out.print(val+" ");
        }
    }
}
