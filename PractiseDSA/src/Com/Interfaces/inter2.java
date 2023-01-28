package Com.Interfaces;
interface Int1{
    void name1();
}
interface Int2 extends Int1{
    void name2();
}
interface Int3 extends Int1{
    void name3();
}
class A implements Int1 {
    public void name1(){
        System.out.println("Int2");
    }
    public void name2(){
        System.out.println("Int3");
    }

}
class B implements Int3 {
    public void name1(){
        System.out.println("Int2");
    }

    public void name3(){
        System.out.println("Int4");
    }
}
public class inter2 {
    public static void main(String[] args) {
        A a1=new A();
        a1.name1();
        a1.name2();
       B b1=new B();
       b1.name1();
       b1.name3();
    }
}
