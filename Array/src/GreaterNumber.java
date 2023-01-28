public class GreaterNumber {
    public static void great(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean status=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    status=false;
                }
            }if(status){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        great(arr);
    }
}
