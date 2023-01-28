public class stock {
    public static void stockProfit(int[] arr){
        int sum=0;
        int size=arr.length;
        int i=1;
        while(i<size){
           if(arr[i-1]<arr[i]){
               sum=sum+(arr[i]-arr[i-1]);//4 //9
               i++;
           }
           else{
               i++;
           }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
int[] arr={1,5,3,1,2,8};
stockProfit(arr);
    }
}
