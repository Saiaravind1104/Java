package Com.Inharitance;

public class Realme extends Phone{
    private String popupCamera;
    private int frontCam;
    private int backcam;
    public Realme(String model, int Ram, int Rom, double displaySize, String procosser,String popupCamera,int frontCam,int backcam) {

        super("Realme", model, Ram, Rom, displaySize, procosser);
        this.popupCamera = popupCamera;
        this.backcam=backcam;
        this.frontCam=frontCam;
    }


    public String getPopupCamera() {
        System.out.println("PopupCamera : "+popupCamera);
        return popupCamera;
    }

    public int getFrontCam() {
        System.out.println("FrontCam = "+frontCam);
        return frontCam;
    }

    public int getBackcam() {
        System.out.println("BackCam = "+backcam);
        return backcam;
    }

    public void colour(){
        System.out.println("Color is green");
       super.colour();

    }
    public void colour(String colour){
        super.colour();
    }
}
