package SystemClass.Practise;

public class Demo1 extends Object{
    public static int a=0;
    public int b=0;
    Demo1(){
        a++;
        b++;
    }
    public void display(){
        System.out.println("static variable = "+a);
        System.out.println("non static variable = "+b);
    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.display();
        Demo1 d2=new Demo1();
        d2.display();
        Demo1 d3=new Demo1();
        d3.display();
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

    }
}
