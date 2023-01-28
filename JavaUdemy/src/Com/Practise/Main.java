package Com.Practise;

public class Main {
    public static void main(String[] args) {
        CreditCard c1=new CreditCard("Sai Aravind",1500000,"Saiaravind1104@gmail.com");
        c1.getName();
        c1.getCreditLimit();
        c1.getEmail();

        System.out.println("*****************************************************");
        CreditCard c2=new CreditCard();
        c2.getName();
        c2.getCreditLimit();
        c2.getEmail();

        System.out.println("****************************************************");
        CreditCard c3=new CreditCard("Aravind","Saiaravind@1104");
        c3.getName();
        c3.getCreditLimit();
        c3.getEmail();


    }
}
