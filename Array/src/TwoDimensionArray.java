import java.util.Scanner;

public class TwoDimensionArray {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of rows = ");
        int row=s.nextInt();
        int[][] arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter the number of colums "+i+" = ");
            int col=s.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<col;j++){
                System.out.println("Enter the value at index "+j+" = ");
                int e=s.nextInt();
                arr[i][j]=e;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
