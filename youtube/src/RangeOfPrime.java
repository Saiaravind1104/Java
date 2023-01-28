public class RangeOfPrime {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 0;


        for (int i = a; i <= b; i++) {// 7
            for (int j = 2; j <i; j++) {//j= 2 3 4 5 6
                if(i%j==0){//9/2 9/3 9/4 9/5...........9/8
                    c++;//1
                }

            }if(c==0){
                System.out.println(i);
            }
            else{
                c=0;
            }
        }
    }
}
