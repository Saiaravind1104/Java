package Com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int[] original = arr;
        System.out.println(Arrays.toString(arr));
        arr=new int[7];
        for(int i=0;i<original.length;i++){
            arr[i]=original[i];
        }
        arr[5]=6;
        arr[6]=7;

        System.out.println(Arrays.toString(arr));

    }
}
