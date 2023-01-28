package Com.HackerRank;

import java.util.Scanner;

public class Kangaroo {
    public static void printStars(int n)
    {
        int i, j;
        for(i=0; i<n; i++)
        {
            System.out.print("  ");
        }
        for(j=0; j<=i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int x1=scan.nextInt();
//        int v1=scan.nextInt();
//        int x2=scan.nextInt();
//        int v2=scan.nextInt();
//        printStars(5);
        // size of the triangle
        int size = 5;
        // loop to print the pattern
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
