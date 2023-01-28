public class recy {
    public static void rec(int a){
        if(a>10)
        {
            return;
        }
        System.out.println("at index = "+a);
        if(a%2==0){
            System.out.println(a);
        }
       rec(a+1);
    }
    public static void main(String[] args) {
        rec(1);

    }
}
