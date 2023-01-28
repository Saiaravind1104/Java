public class javac9 {
    public static void main(String[] args) {
        int a=18 ;
        int sum=0;
        for(int i=a;i!=0;i/=10){
            int last=i%10;
            sum+=last;
        }
        if(a%sum==0){
            System.out.println("Harsad Number "+ a);
        }else{
            System.out.println("Not Harsad Number "+ a);
        }
    }
}
