public class pal {
    public static void main(String[] args) {
        int a=123;
        int rev=0;

        for(int i=a;i!=0;i/=10){
            int b=i%10;
            rev=10*rev+b;
        }
        System.out.println(rev);


    }
}
