public class range {
    public static void main(String[] args) {
       int a=712;
       int large=0;
       int small=9;
       int count=0;
       for(int i=a;i!=0;i/=10){
           int b=i%10;
           if(large<b){
               large=b;
           }else{
               small=b;
           }
       }
        int b=large+small;
       for(int j=2;j<b;j++){
           if(b%j==0){
               count++;
           }
       }if(count==0){
            System.out.println("Prime number = "+b);
        }else{
            System.out.println("Not a prime number = "+b);
        }
    }
}
