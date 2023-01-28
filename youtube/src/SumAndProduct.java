public class SumAndProduct {
    //10 to 20" --> condition 1"
    // 10 to 20 = even number --> condition 2
    //even number sum -->condition 3
    //even numbers product
    //sum==product
    public static void main(String[] args) {
        int sum=0;
        int product =1;
        for(int i=10;i<=20;i++){
            // 10 11 12 13 14 15 16 17 18 19 20

            if(i%2==0){
                //10 12 14 16 18 20
                System.out.println("Even number = "+i);
                sum=sum+i;// 0+10=10//10+12=22//
                product =product*i;

            }
        }System.out.println("sum = "+sum);
        System.out.println("Product = "+product);
        if(sum==product){
            System.out.println("sum and product are equal");
        }else{
            System.out.println("sum and product are Not equal");
        }
    }
}
