public class fact2 {
    public static void main(String[] args) {
        long pro=1;
        long fact=1;
        for(int i=1;i<=3;i++){
            pro*=i;
        }

        for(int j=1;j<=pro;j++){
            fact*=j;
        }
        System.out.println(fact);


    }
}
