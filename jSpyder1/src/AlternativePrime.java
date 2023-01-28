public class AlternativePrime {
    public static void main(String[] args) {
        int a=20;
        int altCount=0;
        for(int i=2;i<=a;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                altCount++;
                if(altCount%2==1){
                    System.out.println(i);
                }
            }
        }
    }
}
