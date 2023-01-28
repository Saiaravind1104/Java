public class perfectNumber {
    public static boolean isPerfectNumber(int a){
        int b=a;
        int i=1;
        int sum=0;
        if(a>=1){
            while(a>i){
                if(a%i==0){
                    System.out.println(i);
                    sum=sum+i;
                }
                i++;
            }
            System.out.println("sum = "+sum);
            if(sum==a){
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}