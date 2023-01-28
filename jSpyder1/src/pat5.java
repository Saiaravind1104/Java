public class pat5 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i==j)||(j+i==6)){
                    System.out.print("X");
                }else if(i==1){
                    System.out.print("b");
                }else if(j==1){
                    System.out.print("a");
                }else if(i==5){
                    System.out.print("d");
                }else if(j==5){
                    System.out.print("c");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
