import java.util.Scanner;

public class minandmax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        boolean first=true;
        while(true){
            System.out.println("Enter the number = ");
            boolean check=scan.hasNextInt();
            if(check){
                int number=scan.nextInt();
//                if(first){
//                    first=false;
//                    min=number;
//                    System.out.println("min if first statement = "+min);
//                    max=number;
//                    System.out.println("max if first statement = "+max);
//                }
                if(number>max){
                    max=number;
                    System.out.println("max if statement = "+max);
                }
                if(number<min){
                    min=number;
                    System.out.println("min if statement = "+min);
                }
            }else{
                break;
            }scan.nextLine();
        }scan.close();
        System.out.println("Max = "+max+" and Min = "+min);


    }
}
