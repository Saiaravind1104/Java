package Com.MethodHidding;
class Sample1{
    public static void method(){
        System.out.println("Sample 1");
    }
    public void method2(){
        System.out.println("Sample 1 And Non static");
    }
}
class Sample2 extends Sample1{
    public static void method(){
        System.out.println("Sample 2");
    }
    public void method2(){
        System.out.println("Sample 2 And Non static");
    }
}
public class Method_Hidding {
    public static void main(String[] args) {
        Sample1 s1=new Sample2();
        Sample1.method();
        s1.method();
        s1.method2();

    }
}
