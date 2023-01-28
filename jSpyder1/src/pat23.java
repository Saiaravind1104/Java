public class pat23 {
    public static void main(String[] args) {
        int a=1;
        char b='a';
        int c=5;
        char d='e';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j==1){
                    System.out.print(a++);
                }else if(j==3){
                    System.out.print(c++);
                }else if(j==2){
                    System.out.print(b++);
                }else{
                    System.out.print(d++);
                }
            }
            System.out.println();
        }
    }
}
