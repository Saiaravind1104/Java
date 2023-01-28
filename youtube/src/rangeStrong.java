public class rangeStrong {
    public static void main(String[] args) {
        int a=1;
        int b=200;

        for(int i=a;i<=b;i++){//140
            long sum=0;

            for(int j=i;j!=0;j/=10){

                long fact=1;
                int c=j%10;
                for(int m=c;m!=0;m--){//4
                    fact*=m;//
                }sum+=fact;


            } if(sum==i){
                System.out.println(i);
            }

        }

    }
}
