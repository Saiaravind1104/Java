public class second {
    public static int second(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }int store=-1;
        for(int i=1;i< arr.length;i++){
            if(arr[0]!=arr[i]){
                store=arr[i];
                break;
            }
        }return store;
    }

    public static void main(String[] args) {
        int[] arr={20,40,60,59,11};
        int b=second(arr);
//        for(int val:arr){
//            System.out.println(val);
//        }
        System.out.println(b);
    }
}
