public class Div3and5 {
    public static void main(String[] args){
        //3 and 5 divisible upto 1000
        int count=0;
        int c=0;

        for(int i=1;i<=1000;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("Divisible by 3 and 5= "+i);
                c++;
                count=count+i;
            }
            if(c==5){

                 break;
            }


        }System.out.println("Sum = "+count);



    }
}
