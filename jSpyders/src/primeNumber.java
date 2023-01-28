public class primeNumber {
    public static void main(String[] args) {
        int a=10;
        int n1=0;
        int n2=1;
        int sum=0;

        for(int i=3;i<=a;i++){
            int count=0;//13 21
            sum=n1+n2;
            n1=n2;
            n2=sum;
            for(int j=2;j<sum;j++){
                if(sum%j==0){
                    count++;
                }
            }if(count==0){
                System.out.println(sum);
            }
        }
    }
}
