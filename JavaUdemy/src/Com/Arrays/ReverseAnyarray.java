package Com.Arrays;

import java.util.Arrays;

public class ReverseAnyarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        int maxIndex= arr.length-1;
        int halfLength= arr.length/2;
       for(int i=0;i< halfLength;i++){
           int temp=arr[i];
           arr[i]=arr[maxIndex-i];
           arr[maxIndex-i]=temp;
       }return arr;
    }
}
