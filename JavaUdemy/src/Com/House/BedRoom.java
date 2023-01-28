package Com.House;

public class BedRoom {
    private int bedCost;

    @Override
    public String toString() {
        return "BedRoom{" +
                "bedCost=" + bedCost +
                ", tv=" + tv +
                ", bath=" + bath +
                '}';
    }

    public int getBedCost() {
        return bedCost;
    }

    public void setBedCost(int bedCost) {
        this.bedCost = bedCost;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public Bathroom getBath() {
        return bath;
    }

    public void setBath(Bathroom bath) {
        this.bath = bath;
    }

    public BedRoom(int bedCost, Tv tv, Bathroom bath) {
        this.bedCost = bedCost;
        this.tv = tv;
        this.bath = bath;
    }

    private Tv tv;
    private Bathroom bath;
}
