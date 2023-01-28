public class SearchInUnsortedArray {
    public static void search(int[] a,int num){
        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
               j=i;
            }
        }if(j<=0){
            System.out.println(j);
        }else{
            System.out.println(j);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        search(arr,4);
    }
}
