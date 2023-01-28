public class Practise{
    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

    //The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
   public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        //1.234566, -1.234
       //1.234*1000=1234 , -1.234*1000=-1234
       double f=a*1000;
       double g=b*1000;
       int c=(int)f;//bscilfd
       int d=(int)g;
       if (c==d){
           return true;
       }else{
           return false;
       }
   }
   public static void main(String[] args){
       boolean p=areEqualByThreeDecimalPlaces(-3.1756, -3.175);
       System.out.println(p);
       p=areEqualByThreeDecimalPlaces(3.175, 3.176);
       System.out.println(p);
       p=areEqualByThreeDecimalPlaces(3.0, 3.0);
       System.out.println(p);
       p=areEqualByThreeDecimalPlaces(-3.123, 3.123);
       System.out.println(p);
   }
}