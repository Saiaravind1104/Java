package Com.Object_Casting;
interface Father{
    void house();

}
class Son implements Father{
    public void house(){
        System.out.println("House is Completed");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Father f1=(Father)new Son();
        f1.house();
    }
}
