public class javac2 {
    public static void main(String[] args) {
        int[] arr={1,4,3,5};
        int sum=0;
        for(int i=0;i<4;i++){
            sum+=arr[i];
        }
        int maxSum=0;
        for(int i=1;i<=5;i++){
            maxSum+=i;
        }
        int sub=maxSum-sum;
        System.out.println(sub);
    }
}
