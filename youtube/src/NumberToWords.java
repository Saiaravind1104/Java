public class NumberToWords {
    public static void numberToWorld(int a){
        if(a>=0){
            int c=a;
            int rem;
            int sum;
            int d=0;
            while(d<a){
                rem=a/10;
                System.out.println(rem);
                if(rem==0){
                    System.out.println(" Zero ");
                }else if(rem==1){
                    System.out.println(" One ");
                }else if(rem==2){
                    System.out.println(" Two ");
                }else if(rem==3){
                    System.out.println(" Three ");
                }else if(rem==4){
                    System.out.println(" Four ");
                }else if(rem==5){
                    System.out.println(" Five ");
                }else if(rem==6){
                    System.out.println(" Six ");
                }else if(rem==7){
                    System.out.println(" Seven ");
                }else if(rem==8){
                    System.out.println(" Eight ");
                }else if(rem==9){
                    System.out.println(" Nine ");
                }
                d++;
            }
        }else{
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        numberToWorld(1235);
    }
}
