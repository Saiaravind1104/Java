public class spyNumbers {
    public static void main(String[] args) {
        int a=133;
        int sum=0;
        int pro=1;
        for(int i=a;i!=0;i/=10){
            int b=i%10;
            sum+=b;
            pro*=b;
        }
        if(sum==pro){
            System.out.println("Sunny number = "+a);
        }else{
            System.out.println("Not a sunny number = "+a);
        }
    }
}
