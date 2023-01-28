public class maxiMum {
    public static int input(int[] arr){
        int store=0;
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>store){
                store=arr[i];
                //return store;
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] a={10,20,50,12,11};
        int b=input(a);
        System.out.println(b);
    }
}
