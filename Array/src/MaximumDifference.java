public class MaximumDifference {
    public static void max(int[] arr){
        int small=0;
        int check=0;
        for(int i=1;i<arr.length;i++){
            int sum=arr[i]-arr[check];
            if(sum>small){
                small=sum;
            }
            check++;
        }
        System.out.println(small);
    }
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        max(arr);
    }
}
