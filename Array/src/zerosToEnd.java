public class zerosToEnd {
    public static int[] zero(int[] arr){

        for(int i=0;i< arr.length;i++){
          if(arr[i]==0){
              for(int j=i+1;j<arr.length;j++){
                  if(arr[j]!=0){
                      int temp=arr[j];
                      arr[j]=arr[i];
                      arr[i]=temp;
                  }
              }
          }
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,0,5,8,0,3};
        int[] zero=zero(arr);
        System.out.println("Zero to Last");

        for(int val:zero){
            System.out.print(val+" ");
        }
    }
}
