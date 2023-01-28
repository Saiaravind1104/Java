package Com.Aravind;

public class Bank {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public Bank(){
        this("STILL NOT ENTERED",0,"STILL NOT ENTERED","STILL NOT ENTERED","STILL NOT ENTERED");
    }



    public Bank(String accountNumber,long balance,String customerName,String email,String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void setAccountNumber(String number){
        accountNumber=number;
    }
    public void setCustomerName(String name){
        customerName=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String number){
        phoneNumber=number;
    }
public void getBalance(){
    System.out.println("Balance = "+balance);
}
    public String getAccountNumber() {
        System.out.println("Account Number = "+accountNumber);
        return accountNumber;
    }
    public String getCustomerName(){
        System.out.println("name = "+customerName);
        return customerName;
    }
    public String getEmail(){
        System.out.println("email = "+email);
        return email;
    }
    public String getPhoneNumber(){
        System.out.println("Phone number = "+phoneNumber);
        return phoneNumber;
    }

    public void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited amount  susccesfully : "+amount);
        System.out.println("Total Balance: "+balance);
    }
    public  void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdraw succesfully : "+amount);
            System.out.println("Remaing balance : "+balance);
        }else{
            System.out.println("Not sufficent balance");
            System.out.println("Your current balance : "+balance);
        }
    }
}
