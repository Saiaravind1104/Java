package Com.Interfaces;
abstract class Ab1{
    abstract void fun();
    public void fun2(){
        System.out.println("Fun2");
    }
}
interface Sample1{
    void fun3();
}
class Ex1 extends Ab1 implements Sample1{
    public void fun(){
        System.out.println("Fun");
    }
    public void fun3(){
        System.out.println("Fun3");
    }
}
public class inter5 {
    public static void main(String[] args) {
        Ex1 e1=new Ex1();
        e1.fun();
        e1.fun2();
        e1.fun3();
    }
}
