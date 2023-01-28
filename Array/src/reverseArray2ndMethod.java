public class reverseArray2ndMethod {
    public static int[] reverse(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("Orginal array");
        for(int val:arr){
            System.out.print(val+" ");
        }
        int[] reverse=reverse(arr);
        System.out.println();
        System.out.println("Rverse array");
        for(int val:reverse){
            System.out.print(val+" ");
        }
    }
}
