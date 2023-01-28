public class MethodOverloading {
    static void samename(int x,int y){
        System.out.println(x*y);
    }
    static void samename(double x, double y){
        System.out.println(x+y);
    }
    public static void main(String[] args){
       /* int mul= samename(4,4);
        double add= samename(4.08,6.02);
        System.out.println(mul);
        System.out.println(add);*/
        samename(10,20);
        samename(8.0010,2.0010);
    }
}
