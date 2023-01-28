package Abstraction;
abstract class Abs{
    public abstract void block();
}
class Demo1 extends Abs{
    public void block(){
        System.out.println("Demo1 is unblocked");
    }
}
class Demo2 extends Abs{
    public void block(){
        System.out.println("Demo2 is unblocked");
    }
}
class Helper{
    public  Abs call(){
        Abs a1=new Demo2();
        return a1;
    }
}
public class Abstraction1 {
    public static void main(String[] args) {
        Helper h1=new Helper();
        Abs a1=h1.call();
        a1.block();
    }

}
