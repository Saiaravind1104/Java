import java.util.ArrayList;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String temp="";
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=97 &&ch<=122){
                temp=temp+ch;
            }else{
                list.add(temp);
                temp="";
            }
        }
        System.out.println(list);
    }
}
