public class pat10 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j){
                    System.out.print("X");
                }else if(i==1){
                    System.out.print("X");
                }else if(j==4){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
