public class a3 {
    public static void main(String[] args) {
       //write  a program to check sumation and product of the number is equal or not,if its is equal check sumation
        //is perfect number or not else;check product is perfect square number or not
        int a=1;
        int b=10;
        int sum=0;
        int pro=1;
        int sum1=0;
        boolean status=false;
        for(int i=a;i<=b;i++){
            sum+=i;
            pro*=i;
        }
        System.out.println("sum ="+sum);
        System.out.println("product ="+pro);
        if(sum==pro){
            for(int j=1;j<sum;j++){
                if(sum%j==0){
                    sum1+=j;
                }
            }if(sum==sum1){
                System.out.println("Perfect number = "+sum);
            }else{
                System.out.println("Not a perfect number = "+sum);
            }
        }else{
            for(long m=1;m<=pro;m++){
              if(m*m==pro){
                   status=true;
              }
            }if(status){
                System.out.println("Perfect square = "+pro);
            }else{
                System.out.println("Not a perfect square = "+pro);
            }
        }
    }
}
