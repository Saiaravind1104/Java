import java.util.Scanner;

public class Wheather {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] T=new int[12];
        int count=0;
        int max=0;
        int sum=0;
        int maxCount=0;
        int minCount=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<12;i++){
            int b=s.nextInt();
            T[i]=b;
            count++;
            if(T[i]>max){
                max=T[i];
            }
            if(T[i]<min){
                min=T[i];
            }
            if(T[i]==max){
                maxCount=count;
            }
            if(T[i]==min){
                minCount=count;
            }


        }
        for(int i=0;i<12;i++){
            sum+=T[i];
        }
        System.out.println("Total rainfall : "+sum);
        System.out.println("Average rainfall : "+(sum/12));
        System.out.println("Lowest rainfall month : "+maxCount);
        System.out.println("Highest rainfall month : "+minCount);

    }
}
