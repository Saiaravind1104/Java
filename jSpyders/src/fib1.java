public class fib1 {
    public static void main(String[] args) {
        int a=10;
        int num1=0;
        int num2=1;
        int add=num1+num2;
        int sum=0;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=3;i<=a;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            add+=sum;
            System.out.println(sum);

        }
        System.out.println(add);
    }
}
