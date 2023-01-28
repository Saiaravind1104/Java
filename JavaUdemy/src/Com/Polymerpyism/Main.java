package Com.Polymerpyism;
class Car {
    private boolean engine=true;




    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    private int cylinders;
    private int wheels=4;

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void result(){

    }

    Car( boolean engine, int cylinders, int wheels){
        this.engine=true;
        this.cylinders=cylinders;
        if(wheels!=4){
            this.wheels=4;
        }


    }

    public String startEngine(){
        return "Engine is starting ";
    }

    public String accelerate(){
        return "Acceleration is done";
    }

    public String brake(){
        return "Brake is Applied";
    }


}
class Tata extends Car{
    private String name;
        Tata(String name,boolean engine,int cylinders,int wheels){
            super(engine,cylinders,wheels);
            this.name=name;
        }

}
class Tesla extends Car{
    private String name;

    Tesla(String name, boolean engine, int cylinders, int wheels) {
        super(true, 4, 4);
        this.name=name;
    }

    @Override
    public String startEngine() {
        return name+" engine is starting";
    }

    @Override
    public String accelerate() {
        return name+" Accelerate is starting";
    }

    @Override
    public String brake() {
        return super.brake();
    }
}



 class BMW extends Car{
    private String name;

    BMW(String name, boolean engine, int cylinders, int wheels) {
        super(true, 4, 4);
        this.name=name;
    }

    @Override
    public String startEngine() {
        return name+" engine is starting";
    }

    @Override
    public String accelerate() {
        return name+" Accelerate is starting";
    }

    @Override
    public String brake() {
        return name+" Accelerate is starting";
    }
}


public class Main{
    public static void main(String[] args) {
        Tesla t1=new Tesla("tesla",true,4,4);
        System.out.println(t1.startEngine());
        System.out.println(t1.accelerate());
        System.out.println(t1.brake());
        Tata t2=new Tata("Tata",true,4,4);
        System.out.println(t2.startEngine());
        System.out.println(t2.accelerate());
        System.out.println(t2.brake());
        BMW t3=new BMW("BMW",true,4,4);
        System.out.println(t3.startEngine());
        System.out.println(t3.accelerate());
        System.out.println(t3.brake());
        Benz t4=new Benz("Benz",true,4,4);
        System.out.println(t4.startEngine());
        System.out.println(t4.accelerate());
        System.out.println(t4.brake());

    }


}
