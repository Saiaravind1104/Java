public class a1 {
    //m to n
    //factors
    public static void main(String[] args) {
        int m=1;
        int n=100;
        int sum=0;
        for(int i=m;i<=n;i++){
           // System.out.println("1St sum = "+sum); 10 1 2 5
           for(int j=1;j<i;j++){
               if(i%j==0){
                   sum+=j;//1+2+5=8

               }

           }
//            System.out.println("i = "+i);
//           System.out.println("sum= "+sum);

           if(i==sum){
                System.out.println("Perfect Numbers = "+i);
            }
           sum=0;
        }
    }
}
