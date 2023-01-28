package Practise.Inheritance1;
interface inter{
    int a=10;
    void rollNumber();
}
interface inter1 extends inter{
    void className();
}
abstract class Abs {
    abstract public void name();
     public static void num(){
         System.out.println("123");
    }
}
class Demo extends Abs implements inter1{
    public  int a;
    public int b;
    public int c;
    Demo(int a){
        this.a=a;
    }
    Demo(int a,int b){
        this(a);
        this.b=b;
    }
    Demo (int a,int b,int c){
        this(a, b);
        this.c=c;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    public void className(){
        System.out.println("10th class");
    }
    public void rollNumber(){
        System.out.println("19505A0216");
    }
    public  void name(){
        System.out.println("Aravind");
    }
}
class Demo2 extends Demo{
    public int d;
    public int e;
    Demo2(int a,int b,int c,int d,int e){
        super(a,b,c);
        this.d=d;
        this.e=e;
    }
    public void display(){
        System.out.println(d);
        System.out.println(e);
    }

}
public class inh1 {
    public static void main(String[] args) {
//        Demo d1=new Demo2(10,20,30,40,50);
//        d1.display();
//        d1.num();
//        d1.className();
        Abs a1=new Demo2(10,20,30,40,50);
        a1.name();

    }

}
