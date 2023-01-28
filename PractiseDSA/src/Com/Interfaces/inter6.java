package Com.Interfaces;
class Complete{
    public void read(){
        System.out.println("I am reading");
    }
}
interface Sample2{
    void write();
}
class Demo1 extends Complete implements Sample2{
    public void write(){
        System.out.println("I am writeing");
    }
}
public class inter6 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.write();
        d1.read();
    }

}
