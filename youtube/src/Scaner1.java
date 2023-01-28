import java.io.*;
import java.util.Scanner;
public class Scaner1 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the name");
        String c=a.nextLine();
        System.out.println("Name = "+c);
        System.out.println("Enter the number");
        int b= a.nextInt();
        System.out.println("Number = "+b);

    }
}
