import java.util.Scanner;

public class sortSearch {
    public static Scanner s= new Scanner(System.in);
    public static int[] user(){
        System.out.println("Enter the size of the elements = ");
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the index "+i+" value = ");
            arr[i]=s.nextInt();
        }return arr;
    }

    public static int[] sort(int[] arr){
        int len=arr.length;
        int count=0;
        for(int i=0;i<len-1;i++){
            for(int j=1+i;j<len;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr;
    }
    public static void main(String[] args) {
        int array[]=user();
        int sort1[]=sort(array);
        for(int val:sort1){
            System.out.println(val);
        }
    }
}
