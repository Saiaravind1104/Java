import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int balance=0;
        while(true){
            System.out.println("1) deposit 2) withdraw 3)balance 4)exit");
             int a=s.nextInt();
            if(a==1){
                System.out.println("Enter deposit amount = ");
                int deposit =s.nextInt();
                balance=balance+deposit;
                System.out.println("Deposit completed");
            }else if(a==2){
                System.out.println("Enter withdraw amount");
                int withdraw=s.nextInt();
                if(balance<withdraw){
                    System.out.println("Not enough balance to withdraw ");
                }else{
                    balance=balance-withdraw;
                    System.out.println("Withdraw completed ");
                }
            }else if(a==3){
                System.out.println("Balance = "+balance);
            }
            else if(a==4){
                System.out.println("Exit");
                break;
            }else{
                System.out.println("Enter correct option ");
            }
        }
    }
}
