public class countOnes {
    public static void count(int[] arr,int num){
        int count=1;
        int i=1;
        int n= arr.length;
        int small=0;
        while(i<n){
            while(i<n && arr[i]==arr[i-1] ){
                i++;
                count++;
            }
           // System.out.println(arr[i-1]+ " = "+count);
            if(num==arr[i-1] && count>small){
                System.out.println(count);
                small=count;
            }
            i++;
            count=1;

        }

    }
    public static void main(String[] args) {
int[] arr={1,1,1,1};
count(arr,1);
    }
}
