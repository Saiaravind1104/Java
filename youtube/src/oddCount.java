public class oddCount {
    public static void main(String[] args) {
        int count=0;
        for(int i=10;i<=25;i++){
            if(i%2==0){
                count++;
            }
        }System.out.println("Final Count = "+count);
    }
}
