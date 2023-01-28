public class OddEvenCount {
    public static void input(int[] arr){
       int store= arr[0];
       int count=0;
       int max=0;
       int i=1;
       int n= arr.length;
       while(i<n){
           if(arr[i-1]%2==0){
               if(arr[i]%2==1){
                   count++;
               }
           }
       }
    }
    public static void main(String[] args) {
int[] arr={10,12,14,7,8};
input(arr);
    }
}
