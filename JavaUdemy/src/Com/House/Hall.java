package Com.House;

public class Hall {
    private Bathroom bath;
    private Tv tv;
    private int sofaCost;

    @Override
    public String toString() {
        return "Hall{" +
                "bath=" + bath +
                ", tv=" + tv +
                ", sofaCost=" + sofaCost +
                '}';
    }

    public Bathroom getBath() {
        return bath;
    }

    public void setBath(Bathroom bath) {
        this.bath = bath;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public int getSofaCost() {
        return sofaCost;
    }

    public void setSofaCost(int sofaCost) {
        this.sofaCost = sofaCost;
    }

    public Hall(Bathroom bath, Tv tv, int sofaCost) {
        this.bath = bath;
        this.tv = tv;
        this.sofaCost = sofaCost;
    }
}
