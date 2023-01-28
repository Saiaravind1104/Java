import java.util.Scanner;

public class char1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int b=str.length();
        String store="--";
        String value="";
        String add="";
        for(int i=0;i<b;i++){
            char ch=str.charAt(i);
            value=store+ch;
            add+=value;

        }System.out.println(add);

    }
}
