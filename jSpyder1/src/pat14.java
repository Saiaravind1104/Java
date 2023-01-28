public class pat14 {
    public static void main(String[] args) {
        int b=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
               if((i==1)||(i==3)){
                   System.out.print(b++);
               }else{
                   System.out.print(ch++);
               }
            } System.out.println();
        }
    }
}
