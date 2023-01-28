package Com.Interfaces;
interface a{
    void name();
}
interface b extends a{
    void name1();
}
interface c extends b{
    void name2();
}
class Int implements c{
    public void name(){
        System.out.println("sai aravind");
    }
    public void name1(){
        System.out.println("Visu");
    }
    public void name2(){
        System.out.println("Anil");
    }
}
public class Inter1 {
    public static void main(String[] args) {
        Int i1=new Int();
        i1.name();
        i1.name1();
        i1.name2();
    }
}
