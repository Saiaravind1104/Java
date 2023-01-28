package Com.Interfaces;
interface I1{
     abstract void name();
}
interface I2{
    abstract void name();
}
interface I3 extends I1,I2{
    void name();
}
class Name implements I3{
   public void name(){
       System.out.println("Sai aravind");
   }
}
public class inter4{
    public static void main(String[] args) {
        Name n1=new Name();
        n1.name();
    }
}

