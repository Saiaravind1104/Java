public class EvenAlter {
    public static void main(String[] args) {
        int a=1;
        int b=20;
        int count=0;
        for(int i=a;i<=b;i++){//1 2 3 4 5 6
            for(int j=2;j<=i-1;j++){//
                if(i%j==0){
                    count++;
                }
            }if(count==0){
                System.out.println("Prime numbers = "+i);
            }else{
                count=0;
            }
        }
    }
}
