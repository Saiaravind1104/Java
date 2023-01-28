public class NonStaticMethod {
    public void nonStaticMethod(){
        System.out.println("****************Non static method starts*************** ");
        System.out.println("Non static method");
        System.out.println("****************Non static method ends*************** ");
    }
    public void nonStaticMethod2(){
        System.out.println("****************Non static method  two starts*************** ");
        System.out.println("Non static method two");
        System.out.println("****************Non static method two ends*************** ");
    }
    public static void main(String[] args) {
        System.out.println("Main method starts");
        NonStaticMethod n1=new NonStaticMethod();
        n1.nonStaticMethod();
        n1.nonStaticMethod2();
        System.out.println("Main method ends ");

    }
}
