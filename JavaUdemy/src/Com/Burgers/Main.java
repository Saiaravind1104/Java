package Com.Burgers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("Type of Meat");
        System.out.println("1)Beef");
        System.out.println("2)Chicken");
        System.out.println("3)Mutton");
        int a= scan.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("*************************************");
        Additions add=new Additions();
        int c=0;
        while(true){
            System.out.println("Adiitions");
            System.out.println("1)Letturse");
            System.out.println("2)Tamatos");
            System.out.println("3)Carrot");
            System.out.println("4)Chees");
            System.out.println("5)Onions");
            System.out.println("6)Souce");
            System.out.println("7)Exit");
            int b=scan.nextInt();
            if(b==1){
                add.additions(1);
            }else if(b==2){
                add.additions(2);
            }
            else if(b==3){
                add.additions(3);
            }
            else if(b==4){
                add.additions(4);
            }
            else if(b==5){
                add.additions(5);
            }else if(b==6){
                add.additions(6);
            }
            else{
                break;
            }

        }
        //Handburger burger=new Handburger("Burger",a,)
        //Handburger s=new Handburger();
       // s.meatType(a);
        System.out.println();
        System.out.println();
        int add1=add.getAdditionPrices();
       // int add2=s.getPrice();
      //  double total=add1+add2;
        System.out.println("Additional Price :- "+add1);
        //System.out.println("Burger Price :- "+add2);
        //System.out.println("Total cost:- Rs "+total+"/-");

    }


}
