public class lastDigit {
    public static void main(String[] args){
        int a=123;
        int b=233;
        int c=125;
        if(((a>10)&&(a<1000))&&((b>10)&&(b<1000))&&((c>10)&&(c<1000))){
            while(a!=0){
                a%=10;
                break;
            }
            System.out.println(a);
            while(b!=0){
                b%=10;
                break;
            }
            System.out.println(b);
            while(c!=0){
                c%=10;
                break;
            }
            System.out.println(c);
            if((a==b)||(b==c)||(c==a)){
                System.out.println("Same numbers at last");
            }
            else{
                System.out.println("No same numbers");
            }
        }else{
            System.out.println(false);
        }
    }
}
