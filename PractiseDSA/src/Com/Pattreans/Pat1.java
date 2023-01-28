package Com.Pattreans;

public class Pat1 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            for(int j=0;j<=5;j++){
                if(j<=i){
                    System.out.print("X");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
