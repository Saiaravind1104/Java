public class r1 {
    public static int input(int a,int b){
        if(a==0){
            return b;
        }
        return input(a-1,b+a);
    }

    public static void main(String[] args) {
        System.out.println(input(5,0));
    }
}
