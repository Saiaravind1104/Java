public class Multiplication {
    //Print multiplication table of 24, 50 and 29 using loop.
    public static void mul(int a){

        for(int b=1;b<=10;b++){
            System.out.println(a*b);
        }


    }
    public static void main(String[] args){
        System.out.println("24 table");
        mul(24);
        System.out.println("50 table");
        mul(50);
        System.out.println("29 table");
        mul(29);
    }
}
