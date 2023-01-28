public class PrimeNumbers {
    static int count=0;

    public static void num(int a){
        int i=1;
        while(i<=a){
            if(a%i==0){
                count++;
            }
            i++;
        }
        if (count==2){
            System.out.println("Even Number Number");
        }else{
            System.out.println("Not Even Number");
        }
    }
    public static void main(String[] args){
        //only divisible by its self or one
        num(9);

    }
}
