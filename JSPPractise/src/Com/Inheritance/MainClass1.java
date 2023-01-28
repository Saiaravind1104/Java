package Com.Inheritance;
class Vehicle{
    public static void name(){
        System.out.println("Vehicle");
    }
    public void breaks(){
        System.out.println("Break applied for Vehicle");
    }
}
class Car extends Vehicle{
    public static void name(){
        System.out.println("Car");
    }
    public void breaks(){
        System.out.println("Break applied for Car");
    }
}
class Bike extends Vehicle{
    public static void name(){
        System.out.println("Bike");
    }
    public void breaks(){
        System.out.println("Break applied for Bike");
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.breaks();
        Bike.name();
    }

}
