import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[2];

        for(int i=0;i<2;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        int y=s.nextInt();
        int count=0;
        for(int i=0;i<2;i++){
            int b=arr[i]/2;
            int x=b+b;
            int c=b;
            if(x==arr[i]){
                long num=0;

                for(int j =b;j!=0;j/=10){//123 //12 //1
                    int p=j%10;//3 //2 //1
                    num=num*10+p;//3 //32 //321

                } if(c==num){
                    count++;
                }
            }
        }
        System.out.println(count);




    }
}
