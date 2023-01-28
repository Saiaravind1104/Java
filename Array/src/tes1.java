public class tes1 {
    public static void input(int a,int b,int c,int d){
        if(a<=0){
            return;
        }
         input(a-b,b,c,d);
         input(a-c,b,c,d);
        input(a-d,b,c,d);

    }
    public static void main(String[] args) {
        input(23,11,9,12);
    }
}
