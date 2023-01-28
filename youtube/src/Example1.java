public class Example1 {
    //write a program to check sumation of natiral numbers between 1 t0 10 and check is even or odd;
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
        if(sum%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }
}
