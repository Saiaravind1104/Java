import java.util.Scanner;

public class MethodWithArguments {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("sum : "+c);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        MethodWithArguments sum=new MethodWithArguments();
        sum.add(a,b);

    }
}
