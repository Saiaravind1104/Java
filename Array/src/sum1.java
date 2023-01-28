public class sum1 {
    public static void main(String[] args) {
        System.out.println(input(123,0));
    }
    public static int input(int a,int b){
        if(a==0){
            return b;
        }
        int c=a%10;
        return input(a/10,b+c);
    }
}
