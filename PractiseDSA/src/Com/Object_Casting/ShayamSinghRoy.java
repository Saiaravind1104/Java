package Com.Object_Casting;
class Shyam{
    public void writer(){
        System.out.println("Writer");
    }
}
class Gautham extends Shyam{
    public void director(){
        System.out.println("Director");
    }
}
public class ShayamSinghRoy {
    public static void main(String[] args) {
        Shyam s1=(Shyam)new Gautham();
        s1.writer();
        Gautham g1=(Gautham)s1;
        g1.director();
        g1.writer();
    }
}
