public class fact3 {
    public static void main(String[] args) {
        int a=123;
        int sum=0;
        long fact=1;
        for(int i=a;i!=0;i/=10){
            int b=i%10;
            sum+=b;
        }for(int i=1;i<=sum;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
