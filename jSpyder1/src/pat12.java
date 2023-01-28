public class pat12 {
    public static void main(String[] args) {
        char ch='a';
        for(int i=1;i<=4;i++){
            for(char c=1;c<=4;c++){
                if(i==c){
                    System.out.print(ch++);
                }else if(c==1){
                    System.out.print(ch++);
                }else if(i==4){
                    System.out.print(ch++);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
