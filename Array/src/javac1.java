public class javac1 {
    public static int[] sum(int[] a,int target){

        for(int i=1;i<a.length;i++){
            int sum=0;
            for(int j=i-1;j<i;j++){
                sum=a[i]+a[j];
                if(sum==target){
                    return new int[] {j,i};

                }
            }
        }return null;
    }
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6};
       int[] temp=sum(arr,5);
       for(int i=0;i< temp.length;i++){
           System.out.print(temp[i]+" ");
       }


    }
}
