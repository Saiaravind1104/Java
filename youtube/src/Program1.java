public class Program1 {
    public static void main(String[] args) {
        int i=1234;
        int j=0;
        for(int b=i;b!=0;b/=10){
            int c=b%10;
            //System.out.println("c value = "+c);
            if(c%2==0){
                System.out.println("Even numbers = "+c);
                j+=c;
            }
        }
       System.out.println("Sum = "+j);
    }
}
