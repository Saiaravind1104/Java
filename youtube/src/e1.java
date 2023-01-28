public class e1 {
    public static void main(String[] args) {
        int m=12;
        int n=45 ;
        long pro=1;
        long sum=0;
        int sum1=0;
        //System.out.println("Highest value of int = "+Integer.MAX_VALUE);
        for(int i=m;i<=n;i++){
            sum+=i;
            pro*=i;
        }
        //System.out.println("Product = "+pro);
        long add=sum+pro;
        for(int j=1;j<add;j++){
            if(add%j==0){
                sum1+=j;
            }
        }if(sum1==add){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect Number");
        }
    }
}
