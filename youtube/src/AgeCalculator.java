import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the birth year ");
        int b=a.nextInt();
        System.out.println("Age = "+(2022-b));
        a.nextLine();
        System.out.println("Enter your name :- ");

        String c=a.nextLine();
        System.out.println("Your name = "+c);
        a.close();

    }
}
