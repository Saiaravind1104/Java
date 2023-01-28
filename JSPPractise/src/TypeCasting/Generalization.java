package TypeCasting;
class Demo1{
    public int a=10;
    public void sample(){
        System.out.println("Super Class Method");
    }
}
//Demo1 d1=new Demo2();

public class Generalization {
    public static void main(String[] args) {
        Call(new Demo1());
    }
    public static void Call(Demo1 d1){
        d1.sample();
        System.out.println(d1.a);
    }
}
