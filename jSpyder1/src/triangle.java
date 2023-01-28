public class triangle {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
           char a='e';
           for(int j=5;j>=1;j--){
               if(i>=j){
                   System.out.print(a--);
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
