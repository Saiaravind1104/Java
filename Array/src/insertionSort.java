public class insertionSort {
    public static void main(String[] args) {
        int[] arr={12,11,13,5,6};
        for(int i=1;i< arr.length-1;i++){
            System.out.println("loop 1 = "+i);
            for(int j=i-1;j>=0;j--){
                System.out.println("Loop 2 = "+j);
               if(arr[i]<arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
