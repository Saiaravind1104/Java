package Pattreans;

public class Pat3 {
    public static void main(String[] args) {
       int a=5;
       int sp=a-1;
       int count=1;
       for(int i=0;i<a;i++){
           for(int j=0;j<sp;j++){
               System.out.print(" ");
           }
           for(int k=0;k<count;k++){
               System.out.print("X");
           }
           count+=2;
           sp--;
           System.out.println();
       }
    }
}
