package Com.Inharitance;

public class Main {
    public static void main(String[] args) {
        Phone p1=new Phone("Redmi","Note 10 pro",8,128,14.6,"Snapdragon 865");
        p1.getCompany();
        p1.getDisplaySize();
        p1.getModel();
        p1.getProcosser();
        p1.getRam();
        p1.getRom();
        System.out.println("****************************************************");
        Realme r1 =new Realme("Note 10 pro",8,128,14.6,"Snapdragon 865","Yes",12,24);
        r1.getBackcam();
        r1.getFrontCam();
        r1.getPopupCamera();
        r1.getCompany();
        r1.getDisplaySize();
        //r1.colour();
        r1.colour();
    }
}
