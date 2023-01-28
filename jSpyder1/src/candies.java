import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = s.nextInt();
        int big = 0;
        int[] arr = new int[a];
        int count = 0;
        int temp;
        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            arr[i] = b;
        }//26 20 23
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i] <= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] arrLarge = new int[c];
        for (int i = 0; i < c; i++) {
            arrLarge[i] = arr[i];
        }
        System.out.println(arrLarge[c - 1]);
    }
}

