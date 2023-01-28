public class fibanace {
    public static void main(String[] args) {
        int a=10;
        int fab0=0;//1
        int fab1=1;//2
        int sum=0;

        System.out.print(fab0+" "+fab1);

        for(int i=3;i<=a;i++){
           sum=fab0+fab1;
           fab0=fab1;
           fab1=sum;
            System.out.print(" "+sum);

        }


    }
}
