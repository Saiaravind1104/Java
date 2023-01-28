public class Factorial {
    public static void main(String[] args){
//        Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//        4! = 1*2*3*4 = 24
//        3! = 3*2*1 = 6
//        2! = 2*1 = 2
//        Also,
//        1! = 1
//        0! = 0
//        Write a Java program to calculate factorial of a number.
        num(5);



    }

    public static void num(int a){
        int b=a;
        for(int i=1;i<=a;i++){

            if(b%i==0){
                System.out.println(i);
            }
        }

    }
}
