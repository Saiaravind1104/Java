public class arrayReverse {
    public static int[] reverse(int[] arr){
        int a=0;
        int size=arr.length;
        int[] temp=new int[size];
        for(int i=size-1;i>=0;i--){
            temp[a++]=arr[i];
        }return temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Orginal array ");
        for(int val:arr){
            System.out.println(val+" ");
        }
        System.out.println("Rverse array");
        int[] a=reverse(arr);
        for(int val:a){
            System.out.println(val+" ");
        }
    }
}
