import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        boolean status=false;
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            int N=s.nextInt();
            b[i]=N;
        }

        for(int i=0;i<a;i++){
            System.out.println("Loop1 = "+b[i]);
            int count=0;
            for(int j=i+1;j<a;j++){//
                System.out.println("b[i] = "+b[i]);
                System.out.println("b[j] = "+b[j]);
                if(b[i]==b[j]){
                    count++;
                }
                System.out.println("Count "+b[i]+ " for "+b[j]+" = "+count);
            }
            System.out.println("Total count for " +b[i]+" = "+count);
        }

    }
}
