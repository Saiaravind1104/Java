package Com.Object_Casting;
class A{
    public void demo(){
        System.out.println("Method in Superclass");
    }
}
class B extends A{
    public void demo(){
        System.out.println("Method in Subclass");
    }
}
public class Sample1 {
    public static void main(String[] args) {
      A a1= (A)new B();
      a1.demo();
        B b1=(B)a1;
        b1.demo();
    }
}
