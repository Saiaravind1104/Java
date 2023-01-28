import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {
//        String[] arr = {"I", "am", "aravind", "am", "I"};
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        for (int x = 0; x < loop; x++) {
//            int len= scan.nextInt();
           String temp=scan.next();
            String[] arr=temp.split(" ");
            ArrayList<String> arr1 = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    arr1.add(arr[i]);
                }
            }
            int size = arr1.size();
            for (int i = size - 1; i >= 0; i--) {
                System.out.println(arr1.get(i));
            }

        }
    }
}
