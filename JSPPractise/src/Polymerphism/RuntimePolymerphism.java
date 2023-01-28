package Polymerphism;
class Demo1{
    public void run(){
        System.out.println("Demo1");
    }
}
class Demo2 extends Demo1{
    public void run(){
        System.out.println("Demo2");
    }
}
class Demo3 extends Demo1{
    public void run(){
        System.out.println("Demo3");
    }
}
public class RuntimePolymerphism {
    public static void main(String[] args) {
        Demo1 d1=new Demo3();
        Demo1 d2=new Demo2();
        Demo3 d3=(Demo3) d1;
        d1.run();
        d2.run();
        d3.run();
    }
}
