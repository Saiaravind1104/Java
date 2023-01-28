public class str1 {
    public static void main(String[] args) {
        String str="Sai aravind";
        String add=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           add=ch+add;
        }
        System.out.println(add);
    }
}
