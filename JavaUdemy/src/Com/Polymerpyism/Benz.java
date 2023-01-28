package Com.Polymerpyism;

class Benz extends Car{
    private String name;

    Benz(String name, boolean engine, int cylinders, int wheels) {
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
        return name+" Brake is starting";
    }
}



