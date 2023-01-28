public class Methid1 {

    public static void anil(){
        System.out.println("Anil method is executed");
        System.out.println("Sravani");
        System.out.println("Vaishnavi");

    }
    public static void hello(){
        anil();
        System.out.println("Hello sravani(anil's heart)");
    }
    public static void main(String[] args) {
        System.out.println("Main method starts");
       hello();
        System.out.println("Main method ends");

    }


}
