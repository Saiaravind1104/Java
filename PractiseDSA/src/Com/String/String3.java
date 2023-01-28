package Com.String;

public class String3 {
    public static void main(String[] args) {
        String str="I am aravind I am from Vijayawada";
        String[] arr=str.split(" ");
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
           }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
