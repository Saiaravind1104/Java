package Com.Inharitance;

public class Phone {
    private String company;
    private String model;
    private int ram;
    private int rom;
    private double displaySize;
    private String procosser;

    public String getCompany() {
        System.out.println("Company = "+company);
        return company;
    }

    public String getModel() {
        System.out.println("Model = "+model);
        return model;
    }

    public int getRam() {
        System.out.println("Ram = "+ram);
        return ram;
    }

    public int getRom() {
        System.out.println("Rom = "+rom);
        return rom;
    }

    public double getDisplaySize() {
        System.out.println("Display size = "+displaySize);
        return displaySize;
    }

    public String getProcosser() {
        System.out.println("Processor = "+procosser);
        return procosser;
    }



    public Phone(String company,String model, int Ram, int Rom, double displaySize, String procosser) {
        this.company = company;
        this.model = model;
        this.ram = Ram;
        this.rom=Rom;
        this.displaySize=displaySize;
        this.procosser=procosser;
    }
    public void colour(){
        System.out.println("Colour is red");
    }


}
