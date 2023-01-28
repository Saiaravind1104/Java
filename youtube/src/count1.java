public class count1 {
    public static void main(String[] args) {
        int count=0;

        for(int i=10;i<=30;i++){
            if(i%2==0){
                System.out.println("Even numbers = "+i);
                count++;
                System.out.println("Count in loop = "+count);

            }System.out.println("Final Count = "+count);
        }

    }
}
