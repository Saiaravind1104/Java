public class zero {
    public static int[] zero(int[] arr){
        int count=0;
        for(int i=count+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] a={1,2,0,4,9,0,8,1};
        int[] swap=zero(a);
        for(int val:swap){
            System.out.print(val+" ");
        }
    }
}
