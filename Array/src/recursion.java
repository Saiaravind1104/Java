public class recursion {
    public static int input(int a){
        if(a>5){
            return 0;
        }

        return a+input(a+1);
    }
    public static void main(String[] args) {
int b=input(1);
        System.out.println(b);
    }
}
