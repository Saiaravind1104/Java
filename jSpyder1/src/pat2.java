public class pat2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i+j==6)||(i==j)||(i==1)&&((j>=2)&&(j<=4))||(i==5)&&((j>=2)&&(j<=4))){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
