package Com.String;

public class StringSort {
    public static String sort(String str){
        char[] arr=str.toCharArray();
        String temp="";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
               if(arr[i]<arr[j]){
                   char v=arr[i];
                   arr[i]=arr[j];
                   arr[j]=v;
               }
           }
       }
        for(int i=0;i< arr.length;i++){
            temp+=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        String temp=sort("hello");
        System.out.println(temp);
    }
}
