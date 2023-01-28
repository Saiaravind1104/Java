package SystemClass.Composition;

public class Faculty {
    public static final Mic mic=new Mic();
    public static final Marker mark=new Marker();
    public static Pen pen=new Pen();
    public static void main(String[] args) {
        pen.write();
        pen.price();
        mark.write();
        mic.speak();
    }
}
