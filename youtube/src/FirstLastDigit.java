public class FirstLastDigit {
//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//    The method needs to find the first and the last digit of the parameter number passed to the method,
//    using a loop and return the sum of the first and the last digit of that number.
//
//    If the number is negative then the method needs to return -1 to indicate an invalid value.
    public static int sumOflastdigit(int a){


        //12345
        int b=a;
        int count=0;
        while(b!=0){
            b/=10;
            count++;
            if(count==1){
                System.out.println("First digits = "+b);
                while(b!=0){
                    b=b/10;
                    System.out.println(b);
                    break;
                }

                return b;
            }
        }return 0;

    }
    public static int sumFirstAndLastDigit(int a){

        int b=sumOflastdigit(a);
        int countLast=0;
        while(a!=0){
            a=a%10;
            System.out.println("Last digit = "+a);
            break;
        }return a+b;
    }

    public static void main(String[] args){
        //int a=sumFirstAndLastDigit(100);
        //int b=sumFirstAndLastDigit(111);
        System.out.println(sumFirstAndLastDigit(12345));

        //System.out.println(b);
//        String b="Sai Aravind";
//        int countString=0;
//        System.out.println(b.length());
//        for(int i=1;i<=b.length();i++){
//            countString++;
//        }
//        System.out.println(countString);
    }
}
