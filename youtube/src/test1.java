import org.w3c.dom.ls.LSOutput;

public class test1 {
    public static void main(String[] args) {
        int m=1;
        int n=100;

        int sum2=0;
        for(int i=m;i<=n;i++){
            int sum1=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum1+=j;
                }
            }if(sum1==i){
                System.out.println("Perfect Numbers = "+sum1);
                sum2=sum2+i;
            }

        }
        System.out.println("Sum of perfect numbers = "+sum2);
    }

}
