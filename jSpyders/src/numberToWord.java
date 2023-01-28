import java.util.Scanner;

public class numberToWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rev=0;
        int rev1=0;
        String f="";
        for(int i=a;i!=0;i/=10){
            int b=i%10;
           rev=10*rev+b;
        }
        for(int c=rev;c!=0;c/=10){
            int d=c%10;
            rev1=10*rev1+d;
            String v=convert(d);
            f+=v;
        }
        System.out.println(f);

    }
    public static String convert(int rev1){
        if(rev1 == 0){
            return "zero ";
        }else if(rev1==1){
            return "one ";
        }else if(rev1==2){
            return "two ";
        }else if(rev1==3){
            return "three ";
        }else if(rev1==4){
            return "four ";
        }else if(rev1==5){
            return "five ";
        }else if(rev1==6){
            return "six ";
        }else if(rev1==7){
            return "seven ";
        }else if(rev1==8){
            return "eight ";
        }else{
            return "nine ";
        }
    }
}
