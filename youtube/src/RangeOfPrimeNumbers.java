public class RangeOfPrimeNumbers {
    //range of numbers from to
    //prime numbers check
    //print
    //1 to 10
    public static int count =0;
    public static void range(int a,int b){
        //2 3 5 7 not divisible by any number
        //print highest number
        int count=0;
        if((a>0)&&(b>0)){
           for(int m=2;m<=b;m++){// 1 2 3 4 5 6 7
               for(int j=2;j<=b;j++){
                   if(m%j==0){
                       System.out.println("Zero = "+m);
                       count++;
                   }else{
                       System.out.println("Not a prime number");
                   }
                   if(count==1){
                       System.out.println("Prime number");
                   }
               }
           }
        }else{
            System.out.println("Invalid output");
        }
    }
    public static void main(String[] args){
        range(1,5);
    }
}
