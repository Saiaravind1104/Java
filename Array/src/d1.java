public class d1 {
    public static void main(String[] args) {
        int sum=0;
        int a=12345;
        int v=0;
        int pro1=1;
        int pro2=1;
        int pro3=1;
        for(int i=a;i!=0;i/=10){

            int last=i%10;
            if(v==2){
                for(int j=1;j<=last;j++){
                    pro1=pro1*j;
                }
            }else if((v==0) ||( v==1)){
                pro2=pro2*last;
            }else if(v==3||v==4){
                pro3=pro3*last;
            }
            v++;
        }
        sum=pro1+pro2+pro3;
        System.out.println(sum);
    }
}
