import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        int sum=0;
        int small=Integer.MAX_VALUE;
        int big=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(small>arr[i]){
                small=arr[i];
            }
            if(big<arr[i]){
                big=arr[i];
            }
        }
        int max=sum-small;
        int min=sum-big;
        System.out.println("Total sum = "+sum);
        System.out.println("Maximum sum= "+max);
        System.out.println("Minimum sum= "+min);

    }
}
