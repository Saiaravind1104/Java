package Com.Interfaces;
interface A1{
    abstract void name();

}
class A2 implements A1{
    public void name(){
        System.out.println("Aravind");
    }

}
public class inter7 {
    public static void main(String[] args) {
        A2 a1=new A2();
        a1.name();
    }
}
