public class countOfNumbers {
    public static int sumFirstAndLastDigit(int a){
        if(a>=0) {
            int c=a;

            int b = a;
            for(b=a;b!=1;b/=10){

            }
            for(c=a;c!=0;c%=10){
            }

            return a + c;
        }
        else{
            return -1;
        }


    }
    public static void main(String[] args) {
        int b=sumFirstAndLastDigit(0);
        System.out.println(b);
        boolean c=(0>=0);
        System.out.println(c);


    }
}
