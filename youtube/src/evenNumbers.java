public class evenNumbers {
    static int t=0;
    //print the range
    //check even or not
    //sum of even numbers
    public static void even(int a , int b){
        for(int c=a;c<=b;c++){
            boolean d=checkEven(c);
            if(d==true){

                t=t+c;

            }


        } System.out.println("Sum of even numbers = "+t);
    }
    public static boolean checkEven(int c){
        if(c<0){
            return false;
        }else if(c%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
       even(1,10);

    }
}
