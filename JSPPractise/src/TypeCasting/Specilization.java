package TypeCasting;
class Vehicle{
    public void name(){
        System.out.println("Vehicle");
    }
}
class Demo2 extends Vehicle{
    public void name(){
        System.out.println("Car");
    }
}
class Demo3 extends Vehicle{
    public void name(){
        System.out.println("Bike");
    }
}
class Demo4 extends Vehicle{
    public void name(){
        System.out.println("Scooty");
    }
}
public class Specilization {
    public static void main(String[] args) {
        Call(new Demo2());
        Call(new Demo3());
        Call(new Demo4());
    }
    public static void Call(Vehicle v1){
        v1.name();
    }

}
