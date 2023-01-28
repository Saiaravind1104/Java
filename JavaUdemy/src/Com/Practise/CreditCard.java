package Com.Practise;

public class CreditCard {
    private String name;
    private long creditLimit;
    private String email;
   public  CreditCard(){
        this("Default values",100000,"Default values");
    }
    public CreditCard(String name,long creditLimit,String email){
       this.name=name;
       this.creditLimit=creditLimit;
       this.email=email;
    }
    public CreditCard(String name,String email){
       this(name,100000,email);
    }

    public String getName() {
        System.out.println("Name : "+name);
        return name;
    }

    public long getCreditLimit() {
        System.out.println("Credit card limit : "+creditLimit);
        return creditLimit;
    }

    public String getEmail() {
        System.out.println("Email : "+email);
        return email;
    }
}
