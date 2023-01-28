import java.util.Scanner;

public class BinearySearch {
    public static Scanner s=new Scanner(System.in);
    public static int[] user(){
        System.out.println("Enter the size of the array = ");
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the index "+i+" = ");
            arr[i]=s.nextInt();
        }return arr;
    }
    public static int BinarySearch(int a[],int val){
        int low=0;
        int high=a.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]<val){
                low=mid+1;
            }else if(a[mid]>val){
                high=mid-1;
            }else{
                return (mid);
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] array=user();
        System.out.println("Binary search = "+BinarySearch(array,3));
    }
}
