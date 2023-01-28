package Com.Burgers;

public class Additions {
    private int additionPrices;

    public int getAdditionPrices() {
        return additionPrices;
    }

    public void setAdditionPrices(int additionPrices) {
        this.additionPrices = additionPrices;
    }

    public void setLetture(int letture) {
        this.letture = letture;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public void setChees(int chees) {
        this.chees = chees;
    }

    public void setOnions(int onions) {
        this.onions = onions;
    }

    public void setSouce(int souce) {
        this.souce = souce;
    }
    private int letture=10;
    private int tomato=20;
    private int carrot=30;
    private int chees=40;
    private int onions=50;
    private int souce=25;

    public int getLetture() {
        return letture;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getChees() {
        return chees;
    }

    public int getOnions() {
        return onions;
    }

    public int getSouce() {
        return souce;
    }

    public void additions(int add){
       switch(add){
           //tomato
           case 1:
               additionPrices+=letture;
               break;
           case 2:
               additionPrices+=tomato;
               break;
           case 3:
               additionPrices+=carrot;
               break;
           case 4:
               additionPrices+=chees;
               break;
           case 5:
               additionPrices+=onions;
               break;
           case 6:
               additionPrices+=souce;
               break;

       }
    }
}
