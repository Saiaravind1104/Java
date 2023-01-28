public class SumOfEvenNumbers {
    public static void main(String[] args){
       int a=1234;
       int b=0;
       int count=0;
        while(a!=0){
            b=a%10;
//           System.out.println(b);
            a/=10;
            if(b%2==0){
                System.out.println(b);
                count=count+b;
            }
        }System.out.println(count);
    }

}
