import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        int d=11;
        int b=10;
        int c=1;
        for(int i=1;i<=d;i++){
           c=i*i;
            if(c==d){
                b=11;
                break;

           }

        }if(b==11){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a Perfect number");
        }


    }
}
