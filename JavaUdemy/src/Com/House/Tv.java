package Com.House;

public class Tv {
    private int costTv;
    private String tvName;

    @Override
    public String toString() {
        return "Tv{" +
                "costTv=" + costTv +
                ", tvName='" + tvName + '\'' +
                '}';
    }

    public int getCostTv() {
        return costTv;
    }

    public void setCostTv(int costTv) {
        this.costTv = costTv;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public Tv(int costTv, String tvName) {
        this.costTv = costTv;
        this.tvName = tvName;
    }

    public Tv() {
    }
}
