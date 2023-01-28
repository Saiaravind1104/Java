public class MaxSubArray {
    public static void maxSubArray(int[] arr){
        int maxEnding=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            max=Math.max(maxEnding,max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
int[] arr={-5,1,-2,3,-1,2,-2};
maxSubArray(arr);
    }
}
