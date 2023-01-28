public class sunny1 {
    public static void main(String[] args) {
        int a=111;
        int sum=0;
        boolean status =false;
        for(int i=a;i!=0;i/=10){
            int b=i%10;
            sum+=b;
        }
        for(int j=1;j<=sum;j++){
            if(j*j==(sum+1)){
                status=true;
            }
        }if(status){
            System.out.println("Sunny number = "+sum);
        }else{
            System.out.println("Not a sunny number = "+sum);
        }

    }
}
