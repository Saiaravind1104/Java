import java.util.Scanner;

public class Nonduplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            int b=s.nextInt();
            arr[i]=b;
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                for(int m=j+1;m<a;m++){
                    int c=arr[i]+arr[j]+arr[m];
                    if((c==0)&&((arr[i]!=arr[j])||(arr[j]!=arr[m])||(arr[m]!=arr[i]))){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
        System.out.println();
        for(int i=0;i<a;i++){
            boolean status=true;
            for(int j=i+1;j<a;j++){
                for(int m=j+1;m<a;m++){
                    int c=arr[i]+arr[j]+arr[m];
                    if((c==0)&&((arr[i]!=arr[j])||(arr[j]!=arr[m])||(arr[m]!=arr[i]))){
                    }
                    else{
                        status=false;
                    }
                }
            }if(status){
                System.out.println(arr[i]);
            }
        }
    }
}
