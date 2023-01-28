public class getGreatestCommonDivisor {
    public static void main(String[] args){
        int a=15;
        int b=25;
        int i=1;
        int d=1;
        if((a>10)&&(b>10)){
            while((i<=a)&&( i<=b)){
                if((a%i==0)&&(b%i==0)) {
                     d=i;
                }
                i++;
            }System.out.println("Iteration values = "+d);


        }
        else
        {
            System.out.println(-1);

        }

    }
}
