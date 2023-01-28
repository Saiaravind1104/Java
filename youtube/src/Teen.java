public class Teen {


        public static boolean hasTeen(int a,int b,int c){
            if ((a>=13 && a<=19) ||(b>=13 && b<=19)||(c>=13 && c<=19)){
                return true;
            }else{
                return false;
            }
        }
        public static boolean isTeen(int d){
            if(d>=13 && d<=19){
                return true;
            }else{
                return false;
            }
        }

    public static void main(String[] args) {
        boolean a =isTeen(13);
        System.out.println("Isteen = "+a);
        boolean b =hasTeen(9, 99, 19);
        System.out.println(b);
        b=hasTeen(23, 15, 42);
        System.out.println(b);
        b=hasTeen(22, 23, 34);
        System.out.println(b);
    }




}
