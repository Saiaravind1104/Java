package Com.Polymerpyism.Practise1;
class Temp{
    public static int a=10;
    public boolean b=true;
    public static void replace(){
        System.out.println("Replace in Parent class");
    }
    public void nonStatic(){
        System.out.println("Non static method in parent Class");
    }
}
class Temp1 extends Temp{
    public static int a=20;
    public boolean b=false;

    public static void replace(){
        System.out.println("Replace in child class");

    }
    @Override
    public void nonStatic(){
        System.out.println("Non static method in child Class");
        System.out.println(super.a);
        System.out.println(super.b);
    }
}
public class Main {
    public static void main(String[] args) {
        Temp1 t1=new Temp1();
        System.out.println(t1.a);
        t1.nonStatic();

    }
}
