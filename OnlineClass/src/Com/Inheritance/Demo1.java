package Com.Inheritance;
class Demo2 extends Demo3{
    public static void name(){
        System.out.println("Aravind");
    }


}
class Demo3{
    public static int a=10;
    public static void name1(){
        System.out.println("Sai Aravind");
    }
}
public class Demo1 {
    public static void main(String[] args){
//        Demo2.name();
        Demo2.name1();
        System.out.println(Demo2.a);

    }
}

