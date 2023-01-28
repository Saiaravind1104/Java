import java.util.Scanner;

public class twodArray {
    public static Scanner s=new Scanner(System.in);
    public static int[][] input(){
        System.out.println("Enter number of rows = ");
        int row=s.nextInt();
        int[][] arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter number of coloms  for row "+i+" = ");
            int col=s.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<col;j++){
                System.out.println("Enter the colom "+j+" vale = ");
                int val=s.nextInt();
                arr[i][j]=val;
            }
        }return arr;
    }
    public static void display(int ar[][]){
        for(int i=0;i<ar.length;i++){
            if((1+i)%2==1){
                for(int j=0;j<ar[i].length;j++){
                    System.out.print(ar[i][j]+" ");
                }
            }else{
                for(int j=ar[i].length-1;j>=0;j--){
                    System.out.print(ar[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] in=input();
        display(in);
    }
}
