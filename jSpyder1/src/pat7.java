public class pat7 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if((i==3)&&(j==2)){
                    System.out.print(" ");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
