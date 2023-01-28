public class leftRotate {
    public static int[] left(int[] arr){
        int count=0;
        for(int i=1;i< arr.length;i++){
            int temp=arr[count];
            arr[count]=arr[i];
            arr[i]=temp;
            count++;
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] left=left(arr);
        for(int val:left){
            System.out.println(val);
        }
    }
}
