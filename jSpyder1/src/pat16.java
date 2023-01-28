public class pat16 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            char ch='a';
            for(int j=1;j<=4;j++){
               if((i==1)||(i==2)||(i==3)||(i==4)){
                   System.out.print(ch++);
                }
            }
            System.out.println();
        }
    }
}
