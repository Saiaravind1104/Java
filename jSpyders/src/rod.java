public class rod {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        int temp=sum;
        boolean status=false;
        boolean sunny=false;
        int rev=0;
        int fact=0;
        for(int i=num;i!=0;i/=10){
            int b=i%10;
            if(b%2==1){
                sum+=b;
            }
        }
        int perfectNumber=0;
        for(int i=1;i<sum;i++){
            if(sum%i==0){
                perfectNumber+=i;
            }
            if(i*i==sum){
                status=true;
            }
            if(i*i==sum+1){
                sunny=true;
            }
        }
        for(int i=temp;i!=0;i/=10){
            int c=i%10;
            rev=10*0+c;

        }
        for(int i=temp;i!=0;i/=10){
            int c=i%10;
            for(int j=1;j<c;j++){
                if(c%j==0){
                    fact+=j;
                }
            }
        }
        if(perfectNumber==sum){
            System.out.println("Perfect number = "+sum);
        }else{
            System.out.println("Not a perfect number = "+sum);
        }

        if(status){
            System.out.println("Perefct square = "+sum);
        }else{
            System.out.println("Not a perfect square = "+sum);
        }

        if(sunny){
            System.out.println("Sunny number = "+sum);
        }else{
            System.out.println("Not a Sunny number = "+sum);
        }

        if(rev==temp){
            System.out.println("Palandrome = "+sum);
        }else{
            System.out.println("Not a Palandrome = "+sum);
        }

        if(temp==fact){
            System.out.println("Strong number = "+sum);
        }else{
            System.out.println("Not a Strong number = "+sum);
        }

    }
}
