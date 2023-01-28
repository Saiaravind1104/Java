package Com.Aravind;

public class Main {
    public static void main(String[] args) {
        Bank details=new Bank("1234567",0,"Aravind","saiaravind@gmail.com","7989044779");
        details.getAccountNumber();
        details.getCustomerName();
        details.getPhoneNumber();
        details.getEmail();
        details.getBalance();

        Bank b1=new Bank();
        b1.getAccountNumber();
        b1.getCustomerName();
        b1.getPhoneNumber();
        b1.getEmail();
        b1.getBalance();




//        details.deposit(100);
//        details.setAccountNumber(123456789);
//        details.setCustomerName("Aravind");
//        details.setPhoneNumber("7989044779");
//        details.setEmail("Saiaravind@1104");
//        details.getAccountNumber();
//        details.getEmail();
//        details.getPhoneNumber();
//        details.getCustomerName();
//        Bank an=new Bank();
//        an.withdraw(1000);
    }
}
