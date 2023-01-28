package Com.Object_Casting;
abstract class Wall{
    abstract public void phone();

}
class Implementation extends Wall{
    public void phone(){
        System.out.println("Redmi");
    }
}
class Implementation1 extends Wall{
    public void phone(){
        System.out.println("Redmi");
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
       Wall w1= (Wall) new Implementation();
       w1.phone();
    }
}
