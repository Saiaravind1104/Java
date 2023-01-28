public class numPat {
    public static void main(String[] args) {
        int a=1;
        int count=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(a+++" ");
                if(a>9){
                    a=1;
                }
                count++;
            }System.out.println();
        }

    }
}
