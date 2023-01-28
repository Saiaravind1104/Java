package Com.String;

public class String2 {
    public static boolean fun() {
        String s1="GeeksForGeek";
        String s2="GFG";
        int j=0;
        for(int i=0;i<s1.length() && j<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }return (j==s2.length());
    }

    public static void main(String[] args) {
        boolean b=fun();
        System.out.println(b);
    }
}
