package Com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        ArrayList<Character> list=new ArrayList<Character>();
        list.add('h');
        list.add('a');
        list.add('c');
        list.add('k');
        list.add('e');
        list.add('r');
        list.add('r');
        list.add('a');
        list.add('n');
        list.add('k');
        String str="";
        int v=list.size();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);// h a c k e r r a n k
            for(int j=0;j<v;j++){
                char temp=list.get(j);
                if(temp==ch){
                    str+=temp;
                    list.remove(j);
                    v--;
                }
            }
        }
        System.out.println(str);
        int size=list.size();
        if(str=="hackerrank" ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
