public class prime {
    public static void main(String[] args){

        int count =0;
        for(int a=2;a<=20;a++){

            for(int b=2;b<a;b++){

                if(a%b==0){

                    count=1;
                   break;

                }
                if(count==0){
                    System.out.println(a+" ");
                }
            }

        }
    }
}
