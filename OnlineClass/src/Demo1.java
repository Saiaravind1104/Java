public class Demo1 {
    //Non static method
    private void lightOn(){
        System.out.println("Turn off light");
    }
    public static void aravind(){
        System.out.println("Aravind method starts --------");
        System.out.println("Aravind method ends --------");
    }
    public void anilSravni(){
        lightOn();
        aravind();
        System.out.println("They love each other ");
    }
    public static void main(String[] args) {
        Demo1 d2=new Demo1();
        d2.anilSravni();
    }
}
