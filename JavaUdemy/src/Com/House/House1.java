package Com.House;

public class House1 {
    public static void main(String[] args) {
        Bathroom bath=new Bathroom("hevels",1200,10000,"hello");
        Tv tv=new Tv(12000,"Samsung");
        Hall hall=new Hall(bath,tv,9000);

        Kitchen kitchen=new Kitchen(1000,2,4,"ganga","onida","purify");
        BedRoom bed=new BedRoom(15000,tv,bath);
       // System.out.println(bath);
        //System.out.println(tv);
        System.out.println(hall);
        System.out.println(kitchen);
        System.out.println(bed);
    }
}
