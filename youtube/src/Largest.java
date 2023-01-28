public class Largest {
    public static void main(String[] args) {
        int a=2134;

        int c=Integer.MAX_VALUE;

        while(a!=0){
          int b=(a%10);

            if(b<c){
                c=b;
            }
            a/=10;
        }
        System.out.println("Smallest = "+c);

    }
}
