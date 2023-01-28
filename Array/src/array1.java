public class array1 {
    public static void main(String[] args) {
        int[] a=new int[4];
        int b=1;
        for(int i=0;i<4;i++){
            a[i]=b++;
        }
        System.out.println(a.length);
    }
}
