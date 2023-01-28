public class fact4 {
    public static void main(String[] args) {
        int a=145;
        int sum=0;
        for(int i=a;i!=0;i/=10){
            long fact=1;
            int b=i%10;
            for(int j=b;j!=0;j--){
                fact*=j;

            }sum+=fact;

        }if(sum==a){
            System.out.println("Strong number = "+a);
        }else{
            System.out.println("Not a strong number = "+a);
        }
    }
}
