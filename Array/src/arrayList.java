import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=10;i<=100;i+=10){
            num.add(i);
        }
        System.out.println("1st list ");
        System.out.println(num);
        for(int i=0;i<num.size();i+=2){
            System.out.println("At index remove "+i+" = "+num.remove(i));
        }
        System.out.println("After removing elements =  ");
        System.out.println(num);
        for(int i:num){
            System.out.println(i);
        }

    }
}
