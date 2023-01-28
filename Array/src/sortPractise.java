public class sortPractise {
    public static int num(int a){
        int count=0;
        int temp=a;
        while(a!=0){
            count++;
            a/=10;
        }
        if(count==2){
            return temp;
        }else{
           return -1;
        }
    }
    public static void prime(int c){
        int b=c;
        int count=0;
        if(b>0){
            for(int i=2;i<b;i++){
                if(b%i==0){
                    count++;
                }
            }if(count==0){
                System.out.println("Prime number = "+b);
            }else{
                System.out.println("No a prime number = "+b);
            }
        }else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {

        int pri=num(1);
       prime(pri);
    }
}
