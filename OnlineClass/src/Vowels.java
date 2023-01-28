import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char[] ch={'a','e','i','o','u','A','E','I','O','U'};
        Scanner scan =new Scanner(System.in);
        String str=scan.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch1=str.charAt(i);
            for(int j=0;j<ch.length;j++){
                if(ch[j]==ch1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
