import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=a.length();
        int count=0;
        for(int i=1;i<=b;i++){
            char c=a.charAt(i);
            count++;
            if(c==' '){
                break;
            }
        }
        System.out.println(count);
    }
}
