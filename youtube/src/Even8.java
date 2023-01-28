public class Even8 {
    public static void main(String[] args) {
        int m=1;
        int n=10;
        int count=0;
        int order=1;
        for(int i=m;i<=n;i++){
            System.out.println("____________________________________________________");
            System.out.println("Iteration "+(order++)+ " = "+i);
            if(i%2==0){
                System.out.println("Even numbers = "+i);
                count++;
            }

        }System.out.println("Final Count = "+count);

    }
}
