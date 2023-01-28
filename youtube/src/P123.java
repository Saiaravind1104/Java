import java.util.Scanner;
import java.lang.*;

import static java.lang.Integer.parseInt;

public class P123 {
    public static void main(String[] args) {

        int countEven=0;
        int countOdd=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                countEven++;
            }
            if(ch>='A' && ch<='Z'){
                countOdd++;
            }
        }
        System.out.println("Even = "+countEven);
        System.out.println("Odd = "+countOdd);

    }
}
