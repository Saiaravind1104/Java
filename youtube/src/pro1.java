public class pro1 {
    public static void main(String[] args) {
        int pro=1;
        for(int i=1;i<=10;i++){
            System.out.println("------------------------------------------------");
            System.out.println("Natural number = "+i);

            pro*=i;
            System.out.println("Product in loop = "+pro);
        }
        System.out.println("Product = "+pro);
        if(pro%2!=0){
            System.out.println("Odd number");
        }else{
            System.out.println("Not a odd number");
        }
    }
}
