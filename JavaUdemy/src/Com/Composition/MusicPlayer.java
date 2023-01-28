package Com.Composition;

public class MusicPlayer {
    private String name;
    private int cost;

    MusicPlayer(String name,int cost){
        this.name=name;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
