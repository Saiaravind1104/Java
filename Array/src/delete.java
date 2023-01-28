public class delete {
    public static int[] input(int[] arr,int number){
      int j=0;
      int size=arr.length;
      for(int i=0;i<size;i++){
          if(arr[i]==number){
              j=i;
              break;
          }
      }
      for(int i=j;i<size-1;i++){
          arr[i]=arr[i+1];
      }return arr;

    }
    public static void display(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            System.out.println("At index "+i+" = "+arr[i]);
        }

    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5};
input(arr,4);
display(arr, arr.length);
    }
}
