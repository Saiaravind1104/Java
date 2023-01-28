public class Palandrome {
    
        public static void isPalindrome(int a){

           int temp=a;
           int sum=0;
           while(a>0){
               a=a%10;
               sum=(sum*10)+a;
               a/=10;
           }
            System.out.println(sum);
      }

    public static void main(String[] args) {
            //isPalindrome(123);
        int a=145;
        int rem;
        int temp=a;
        int sum=0;
        while(a!=0){
            rem=a%10;
            System.out.println(a);
            sum=(sum*10)+rem;
            System.out.println(rem);
            a=a/10;
            System.out.println(rem);
        }
        System.out.println(sum);
//        int num = 3553, reversedNum = 0, remainder;
//
//        // store the number to originalNum
//        int originalNum = num;
//
//        // get the reverse of originalNum
//        // store it in variable
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//
//        // check if reversedNum and originalNum are equal
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is Palindrome.");
//        }
//        else {
//            System.out.println(originalNum + " is not Palindrome.");
//        }
    }
}

    

