import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            int b=s.nextInt();
            arr[i]=b;
        }
        int countEven=0;
        int countOdd=0;
        boolean status =true;

            for(int j=0;j<a;j++){
                if(arr[j]%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }
            }
            int[] even=new int[countEven];
            int[] odd=new int[countOdd];
            int count3=0;
            int count4=0;
            for(int j=0;j<a;j++){
                if(arr[j]%2==0){
                    even[count3]=arr[j];
                    count3++;
                }else{
                    odd[count4]=arr[j];
                    count4++;

                }


            }for(int i=0;i<a;i++){
                for(int j=i+1;j<a;j++){
                    if(arr[i]==arr[j]){
                        status=false;
                    }
                }
            }
            if((a>=5)&&(status)){
                System.out.print("Football players =  ");
                for(int i=0;i<countEven;i++){

                    System.out.print(even[i]+" ");
                }
                System.out.println();
                System.out.print("Volleyball players =  ");
                for(int i=0;i<countOdd;i++){

                    System.out.print(odd[i]+" ");
                }
        }else if(status==false){
                System.out.println("Duplicate ids");
            }
            else{
                System.out.println("Duplicate are present - Team members - ID should be unique");
            }

    }
}
