package SystemClass.Composition;

public class Strudent {
    public static Marker mark=new Marker();
    public static Pen pen=new Pen();
    public static void main(String[] args) {
        pen.write();
        pen.price();
        mark.write();
    }
}
