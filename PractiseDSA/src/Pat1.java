public class Pat1 {
    public static void main(String[] args) {
        int a = 7;

        int rows = 5;
//        System.out.println("## Printing the pattern ##");
//        for (int i = 1; i <= rows; i++)
//        {
//            for (int j = rows; j >=i; j--)
//            {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= i; k++)
//            {
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= rows - 1; i++)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k = rows - 1; k >= i; k--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=rows;i++){
//            for(int j=rows;j>=i;j--){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("X ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= rows ; i++)
        {
            for (int k=rows; k >= i; k--)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("X ");
            }

            System.out.println();
        }

    }
}
