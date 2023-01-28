package Com.Object_Casting;
class Air{
    public void wings(){
        System.out.println("Wings are using");
    }
}
class Ground extends Air{
    public void wheels(){
        System.out.println("Wheels are using");
    }
}
public class Aeroplan {
    public static void main(String[] args) {
        Air a1=(Air) new Ground();
        a1.wings();
        Ground g1=(Ground)a1;
        g1.wheels();
        g1.wings();
    }
}
