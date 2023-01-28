import java.util.Scanner;
public class inputReader {
    public static void main(String[] args) {
        int count=0;
        Scanner scan=new Scanner(System.in);




            for(int c=1;c<=10;c++){
                System.out.println("Enter Number "+c+" = ");
                boolean a= scan.hasNextInt();
                if(a) {
                    int d = scan.nextInt();
                    count = count + d;
                } else{
                        System.out.println("Ivalid number");
                    }


        }System.out.println(count);
            scan.close();


    }
}
