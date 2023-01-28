public class Frequency {
    //a b c b c b c d
    public static void fre(int[] arr){
       int freq = 1;
       int i=1;
       int n= arr.length;
       while(i<n){
           while(i<n && arr[i]==arr[i-1]){
               i++;
               freq++;
           }
           System.out.println(arr[i-1]+" = "+freq);
           i++;
           freq=1;

       }if(n==1||(arr[n-1]!=arr[n-2])){
            System.out.println(arr[n-1]+" = "+freq);
        }
    }
    public static void main(String[] args) {
int[] arr={10,10,10,30,30,40};
fre(arr);
    }
}
