public class prime {
    public static void main(String[] args) {
        int a=20;
        int sum=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("Factors = "+i);
                int count=0;
                for(int j=2;j<i;j++){
                   if(i%j==0){
                        count++;
                    }
                }if(count==0){
                    System.out.println("Prime numbers = "+i);
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}
