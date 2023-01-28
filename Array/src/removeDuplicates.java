public class removeDuplicates {
    public static void duplicates(int[] arr){
        int count=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[count-1]){
               arr[count]=arr[i];
               count++;
            }
        }
        System.out.println(count);
        System.out.println("No duplicates array");
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Length ="+arr.length);
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,6,7,8,9 };
        System.out.println("duplicate elemets");
       duplicates(arr);

    }
}
