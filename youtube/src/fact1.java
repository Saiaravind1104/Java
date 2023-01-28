public class fact1 {
    public static void main(String[] args) {
        //write a program to find the factorial of a sumation of natural numbers between 1 to 6
        int sum=0;
        long pro=1;
        for(int i=1;i<=3;i++){
            sum+=i;
        }
        for(int j=1;j<=sum;j++){
            pro*=j;
        }
        System.out.println(pro);
    }
}
