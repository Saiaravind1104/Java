public class greayerNumber2 {
    public static void input(int[] arr){
        int count=arr[arr.length-1];
        System.out.println(arr[arr.length-1]);
        for(int i= arr.length-1;i>=0;i--){
            if(count<arr[i]){
                count=arr[i];
                System.out.println(count);

            }
        }
    }
    public static void main(String[] args) {
int[] arr={7,10,4,10,6,5,2};
input(arr);
    }
}
