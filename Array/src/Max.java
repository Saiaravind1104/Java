public class Max {
    public static void max(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int sum1=arr[j]-arr[i];
                    if(sum1>sum){
                        sum=sum1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr={30,10,8,2};
        max(arr);
    }
}
