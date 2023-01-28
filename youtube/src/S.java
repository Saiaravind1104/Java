public class S {
    public static void main(String[] args) {
        int a=81;
        int sum1=0;
        boolean status=false;
        for(int i=1;i<=a;i++){
            if(i*i==a){
                status=true;
            }
        }if(status){
            System.out.println("Perfect square = "+a);
            int sum=0;
            while(a!=0){
                int d=a%10;
                sum+=d;
                a/=10;
            }for(int j=1;j<sum;j++){
                if(sum%j==0){
                    sum1+=j;
                }
            }if(sum1==sum){
                System.out.println("Perfect number = "+sum);
            }else{
                System.out.println("Not perfect number = "+sum);
            }
        }else{
            System.out.println("Not a perfect square = "+a);
        }
    }
}
