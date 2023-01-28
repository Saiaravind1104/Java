public class pat13 {
    public static void main(String[] args) {
        int a=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i==1)||(i==2)){
                    System.out.print(a++);
                }else{
                    System.out.print(ch++);
                }
            }
            System.out.println();
        }
    }
}
