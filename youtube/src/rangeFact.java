public class rangeFact {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            long pro=1;
            for(int j=1;j<=i;j++){
                pro*=j;
            }

            System.out.println(i +" factorial = "+pro);

        }
    }
}
