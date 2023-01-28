public class Largest {
    public static int input(int[] arr){
        int store=0;
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]>store){
                store=arr[i];
            }
        }return store;
    }
    public static int secondLargest(int[] arr,int store){
        int second=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=store && arr[i]>second){
                second=arr[i];
            }
        }return second;
    }
    public static void main(String[] args) {
        int[] arr={10,20,10};
        int a=input(arr);
        //System.out.println(a);
        System.out.println(secondLargest(arr,a));
    }
}
