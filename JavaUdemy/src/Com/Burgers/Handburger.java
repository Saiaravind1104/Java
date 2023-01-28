package Com.Burgers;

public class Handburger {



        private String rollType;
        private int meat;
        private Additions addonsPrice;
        private String name;
    private int additionsPrice;

    public Handburger( int meat, Additions addonsPrice, String name, int burgerPrice) {
        Additions add=new Additions();
        this.rollType = "Basic";
        this.meat = meat;
        this.addonsPrice = addonsPrice;
        this.name = name;
        this.price = burgerPrice;
       this.additionsPrice= add.getAdditionPrices();

    }


    private int price;
        private String burger;



        private final int beef=100;
        private final int chicken=200;
        private final int mutton=300;


        public void meatType(int meat){
            switch(meat){
                case 1:
                    this.price+=beef;
                    break;
                case 2:
                   this. price+=chicken;
                    break;
                case 3:
                   this. price+=mutton;
                    break;
            }
        }

        public int getPrice(){
            return price;
        }
}



