import java.util.ArrayList;
import java.util.Scanner;

public class binary {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        int size=0;
       int a=s.nextInt();
       for(int i=a;i!=0;i/=10){
           int last=i%10;
           list1.add(last);
       }
        int b=s.nextInt();
        for(int i=b;i!=0;i/=10){
            int last=i%10;
            list2.add(last);
        }
        if(list1.size()>list2.size()){
            size=list1.size();
        }else{
            size=list2.size();
        }
        if(list1.size()>list2.size()){
            for(int i=list2.size();i<size;i++){
                list2.add(0);
            }
        }else{
            for(int i=list1.size();i<size;i++){
                list1.add(0);
            }
        }

        int bar=0;
        for(int i=0;i<size;i++){
            int sum=list1.get(i)+list2.get(i)+bar;
            bar=0;
            if(sum==1){
                list.add(1);
                bar=0;
            }else if(sum==2){
                list.add(0);
                bar=1;
            }else if(sum==3){
                list.add(1);
                bar=1;
            }else if(sum==0){
                list.add(0);
                bar=0;
            }
        }
        list.add(bar);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }



    }
}
