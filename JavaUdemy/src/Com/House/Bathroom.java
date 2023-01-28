package Com.House;

public class Bathroom {
    private String shower;
    private int showerCost;
    private int bathAreaCost;
    private String bathArea;

    @Override
    public String toString() {
        return "Bathroom{" +
                "shower='" + shower + '\'' +
                ", showerCost=" + showerCost +
                ", bathAreaCost=" + bathAreaCost +
                ", bathArea='" + bathArea + '\'' +
                '}';
    }

    public String getShower() {
        return shower;
    }

    public void setShower(String shower) {
        this.shower = shower;
    }

    public int getShowerCost() {
        return showerCost;
    }

    public void setShowerCost(int showerCost) {
        this.showerCost = showerCost;
    }

    public int getBathAreaCost() {
        return bathAreaCost;
    }

    public void setBathAreaCost(int bathAreaCost) {
        this.bathAreaCost = bathAreaCost;
    }

    public String getBathArea() {
        return bathArea;
    }

    public void setBathArea(String bathArea) {
        this.bathArea = bathArea;
    }

    public Bathroom(String shower, int showerCost, int bathAreaCost, String bathArea) {
        this.shower = shower;
        this.showerCost = showerCost;
        this.bathAreaCost = bathAreaCost;
        this.bathArea = bathArea;
    }
}
