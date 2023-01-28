public class practise1 {
    public static void main(String[] args) {
        int a=234;
        boolean status=true;
        int sum=0;
        int count=0;
        for(int i=1;i<234;i++){
            if(a%i==0){
               // System.out.println(i);
                sum+=i;

                if(i==a){
                    status =false;
                }count++;
            }
        }if(sum>a){
            //System.out.println("Weird number");
        }
        int[] s=new int[count];
        for(int i=1;i<234;i++){

            if(a%i==0){

                for(int j=0;j<=count-1;j++){
                    s[j]=i;

                    sum+=i;

                    if(i==a){
                        status =false;
                    }count++;
                }
            }
        }
        for(int j=0;j<=count-1;j++){
            System.out.println(s[j]);
        }

    }
}

