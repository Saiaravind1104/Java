class Class1{
    public int num=10;
    public void display1(){
        System.out.println("Class 1");
    }
}
class Class2 extends Class1{
    public String name="Aravind";
    public void display2(){
        System.out.println("Class 2");
    }
}
class Class3 extends Class1
{
    public String name="Sai";
    public void display2(){
        System.out.println("Class 3");
    }
}
public class Inheratance {
    public static void main(String[] args) {
//        Class1 c1=new Class1();
        Class2  c2=new Class2();
        Class3  c3=new Class3();
        System.out.println(c2.num);
        System.out.println(c2.name);
        System.out.println(c3.num);
      c3.display1();
      c3.display2();
    }
}
