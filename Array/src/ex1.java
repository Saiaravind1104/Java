public class ex1 {
    public static void main(String[] args) {
        int[] arr={90,110,50,30,500};
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j< arr.length;j++){
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
