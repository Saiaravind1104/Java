public class pat {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
           int temp=n--;
            for(int j=5;j>=1;j--){
                if(j>=i){
                    System.out.print(temp);
                    temp--;
                }
            }
            System.out.println();
        }
    }
}
