package Com.Object_Casting;
class Ramam{
    public void ramam(){
        System.out.println("Ramam");
    }
}
class Aparajithudu extends Ramam{
    public void aparajithudu(){
        System.out.println("Aparajithudu");
    }
}
class Remo extends  Ramam{
    public void remo(){
        System.out.println("Remo");
    }
}
public class Movie {
    public static void main(String[] args) {
       Ramam r1=(Ramam) new Aparajithudu();
        r1.ramam();
       Aparajithudu a1=(Aparajithudu) r1;
      a1.aparajithudu();
      a1.ramam();
        Ramam r2=(Ramam)new Remo();
        r2.ramam();
        Remo rv=(Remo)r2;
        rv.remo();
        rv.ramam();
    }
}
