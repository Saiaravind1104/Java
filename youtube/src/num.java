import java.util.Scanner;

class India{
    public String name;
    public static String country="India";
    public void playerName(String a){
        name=a;
    }
        }

public class num {
    public static void main(String[] args) {

        India n1=new India();
        n1.playerName("Dhoni");
        System.out.println(n1.name);
        System.out.println(India.country);
        India n2=new India();
        n2.playerName("Kholi");
        System.out.println(n2.name);
        System.out.println(India.country);

    }
}
