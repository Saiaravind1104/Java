public class pat22 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=4;j>=1;j--){
                if(j<=i){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
