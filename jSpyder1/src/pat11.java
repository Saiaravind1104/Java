public class pat11 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j==1){
                    System.out.print("a");
                }else if(i==j){
                    System.out.print("b");
                }else if(i==4){
                    System.out.print("c");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
