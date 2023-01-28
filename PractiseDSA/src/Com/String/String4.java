package Com.String;

import java.util.ArrayList;

public class String4 {
    public static void main(String[] args) {
        String str="I am aravind";
      String[] list=str.split(" ");
        String rev="";
        for(int i=list.length-1;i>=0;i--){
            String temp1=list[i];
            rev+=temp1+" ";
        }
        System.out.println(rev);

    }
}
