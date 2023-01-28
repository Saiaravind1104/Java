package Com.Interfaces;
interface Test1{
    void name();
}
interface Test2{
    void name1();
}
interface Test3 extends Test1,Test2{
    void name3();
}
class Sample implements Test3{
    public void name(){
        System.out.println("Test1");
    }
    public void name1(){
        System.out.println("Test2");
    }
    public void name3(){
        System.out.println("Test3");
    }
}
public class inter3 {
    public static void main(String[] args) {
        Sample s1=new Sample();
        s1.name();
        s1.name1();
        s1.name3();
    }
}
