public class op {
    public static int check(int[] arr,int b){
        for(int i=0;i<5;i++){
            if(arr[i]==b){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        int a=10;
        for(int i=0;i<5;i++){
            arr[i]=a;
            a+=10;
        }
        int c=check(arr,60);
        System.out.println(c);

    }
}
