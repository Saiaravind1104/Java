public class for2 {
    public static int f = 0;
  // list of odd numbers from range;
    //check odd numbers
    //sum the odd numbers
    public static boolean isOdd(int a) {
        if (a < 0) {
            return false;
        } else if (a % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void sumOdd(int a,int c){


                  for (int d=a;d<=c;d++){

                      boolean v=isOdd(d);

                      if (v==true){
                          f=f+d;
                      }

                  }
            System.out.println(f);

        }



   public static void main(String[] args){
        sumOdd(1,10);

    }
}
