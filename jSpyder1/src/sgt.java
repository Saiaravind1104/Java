import java.util.Scanner;
public class sgt {
    public static String modify_string(String inp_string) {
       String a=inp_string;

       String str1="";
        String str="";
        for(int i=0;i<a.length();i++)
        {
            char h=a.charAt(i);

            if(h=='z'){
                str1+='A';
            }else{
                str1+=(++h);

            }
        }
        for(int i=0;i<str1.length();i++){
            char z=str1.charAt(i);
            if(z=='e'){
                str+='E';
            }
            else if(z=='e'){
                str+='E';
            }
            else if(z=='i'){
                str+='I';
            }else if(z=='o'){
                str+='O';
            }else if(z=='u'){
                str+='U';
            }else{
                str+=z;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String b=s.next();
        String c=modify_string(b);
        System.out.println(c);
    }
}
