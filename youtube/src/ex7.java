public class ex7 {
    public static void main(String[] args) {
        int m=10;
        int n=20;
        int sum=0;
        int pro=1;
        for(int i=m;i<=n;i++){
            sum+=i;
            pro*=i;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+pro);
        if(sum==pro){
            System.out.println("sum and product are equal");
        }else{
            System.out.println("sum and product are not equal");
        }
    }
}
