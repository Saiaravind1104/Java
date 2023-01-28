import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                int s=scan.nextInt();
                arr[j] = s;
            }
            boolean status=false;
            for (int j = 0; j < size; j++) {
                int count=0;

                int small=0;

                for (int m = j + 1; m < size; m++) {
                    if (arr[j] == arr[m]) {
                        count++;
                    }
                }if(count==small){
                   status =false;
                   small=count;
                }else if(count>small){
                    status=true;
                    small=count;
                }

            }
            if(status){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
