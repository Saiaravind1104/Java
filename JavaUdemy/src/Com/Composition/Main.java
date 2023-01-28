package Com.Composition;

public class Main {
    private String nameCar;
    private int Number;
    private MusicPlayer music;
    public Main(String nameCar,int Number,MusicPlayer music){
        this.music=music;
        this.nameCar=nameCar;
        this.Number=Number;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getNumber() {
        return Number;
    }

    public MusicPlayer getMusic() {
        return music;
    }
    public String toString(){
        return "car name = "+nameCar+'\n'+"Car number = "+Number+'\n'+"music cost = "+music.getCost()+'\n'+"music name = "+music.getName();
    }

    public static void main(String[] args) {
        MusicPlayer music=new MusicPlayer("aravind",10000);
        Main ma=new Main("Volvo",1234,music);

        //System.out.println(music.getCost());
        System.out.println(ma);

    }
}
