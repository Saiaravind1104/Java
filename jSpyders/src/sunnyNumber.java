public class sunnyNumber {
    public static void main(String[] args) {
        int a=10;
        int b=a+1;
        boolean status =false;
        for(int i=1;i<=b;i++){
            if(i*i==b){
                status =true;
            }
        }if(status){
            System.out.println("Sunny number = "+a);
        }else{
            System.out.println("Not a sunny number = "+a);
        }
    }
}
