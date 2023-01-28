package Com.House;

public class Kitchen {
    private int glasses;
    private int tables;
    private int doors;
    private String stoveName;
    private String mixy;

    private String waterPurifier;

    @Override
    public String toString() {
        return "Kitchen{" +
                "glasses=" + glasses +
                ", tables=" + tables +
                ", doors=" + doors +
                ", stoveName='" + stoveName + '\'' +
                ", mixy='" + mixy + '\'' +
                ", waterPurifier='" + waterPurifier + '\'' +
                '}';
    }

    public String getWaterPurifier() {
        return waterPurifier;
    }

    public void setWaterPurifier(String waterPurifier) {
        this.waterPurifier = waterPurifier;
    }

    public Kitchen(int glasses, int tables, int doors, String stoveName, String mixy, String waterPurifier){
        this.doors=doors;
        this.glasses=glasses;
        this.mixy=mixy;
        this.stoveName=stoveName;
        this.tables=tables;
        this.waterPurifier=waterPurifier;
    }

    public int getGlasses() {
        return glasses;
    }

    public void setGlasses(int glasses) {
        this.glasses = glasses;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getStoveName() {
        return stoveName;
    }

    public void setStoveName(String stoveName) {
        this.stoveName = stoveName;
    }

    public String getMixy() {
        return mixy;
    }

    public void setMixy(String mixy) {
        this.mixy = mixy;
    }
}
