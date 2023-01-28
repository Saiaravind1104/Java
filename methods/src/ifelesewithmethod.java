public class ifelesewithmethod {
    static void student(int marks) {
        if (marks >= 75) {
            System.out.println("Pass");
        } else if (marks == 35) {
            System.out.println("Just pass");

        }
        else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
        student(35);
    }
}
