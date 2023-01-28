import java.util.Scanner;

public class Vaccine {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }
}
