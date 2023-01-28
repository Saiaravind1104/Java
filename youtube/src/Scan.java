public class Scan {
    public static void main(String[] args) {
        int a=23;
        int sum=1;
        int count=0;
        for(int i=a;i!=0;i/=10){
            int b=i%10;
            sum*=b;
        }
        for(int j=2;j<sum;j++){
            if(sum%2==0){
                count++;
            }
        }if(count==0){
            System.out.println("Prime number = "+sum);
        }else{
            System.out.println("Not a prime number = "+sum);
        }
    }
}
