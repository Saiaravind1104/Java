public class placeLeft {
    public static int[] input(int[] a){

        for(int j=1;j<=2;j++){
            int count=0;
            for(int i=1;i<a.length;i++){
                int temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;
            }
        }
       return a;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] b=input(arr);
        for(int val:b){
            System.out.println(val);
        }

    }
}
