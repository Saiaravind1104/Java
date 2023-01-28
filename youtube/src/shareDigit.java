public class shareDigit {
    public static boolean hasSharedDigit(int a,int b) {
        if(((a>=10)&&(a<=99))&&((b>=10)&&(b<=99))){
            for(int i=0;i<=a;i++){
                a%=10;
                break;
            }
            System.out.println("a = "+a);
            for(int j=0;j<=b;j++){
                b%=10;
                break;
            }System.out.println("b = "+b);

            if(a==b){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12,13));


    }
}
