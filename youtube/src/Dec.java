public class Dec {

        public static boolean areEqualByThreeDecimalPlaces(double a,double b){

            double c=Math.floor(Math.abs(a)*1000);
            double d=Math.floor(Math.abs(b)*1000);
            if (c==d){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String[] args){
            boolean b=areEqualByThreeDecimalPlaces(-1.224,1.234);
            System.out.println(b);
        }

    }

