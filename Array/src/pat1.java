import java.util.Scanner;

public class pat1 {

    public static void main(String[] args) {
Scanner s= new Scanner(System.in);
        String st1=s.next();
        String st2=s.next();
        int count1=st1.length();
        int count2=st2.length();
        char[] arr=new char[count1];
        char[] arr1=new char[count2];
        for(int i=0;i<count1;i++){
            char ch=st1.charAt(i);
            arr[i]=ch;
        }
        for(int i=0;i<count2;i++){
            char ch=st2.charAt(i);
            arr1[i]=ch;
        }
        boolean status =false;
        char ch=s.next().charAt(0);
        for(int i=0;i<arr.length;i++){

           for(int j=0;j< arr1.length;j++){
               if(arr[i]==arr1[j]){
                   if(arr[i-1]=='?' && arr[i+1]=='?'){
                       arr[i-1]=arr1[j-1];
                       arr[i+1]=arr1[j+1];
                   }else{
                       status =true;
                   }
               }else{
                   status=true;
               }
           }
        }
        if(status=false){
            for(char val:arr){
                System.out.print(val);
            }
        }else{
            System.out.println(-1);
        }



    }
}
