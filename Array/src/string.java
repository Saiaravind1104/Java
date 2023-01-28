import java.util.Scanner;

public class string {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String sc=s.nextLine();
        int c=sc.length();
        System.out.println(input(sc,0,c-1));
    }
    public static boolean input(String a,int b,int c){
        if(b>=c){
            return true;
        }
        return ((a.charAt(b)==a.charAt(c))&&(input(a,b+1,c-1)));
    }
}
