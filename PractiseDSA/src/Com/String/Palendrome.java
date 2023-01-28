package Com.String;

public class Palendrome {
    public static boolean check(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                start++;
                end--;
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        boolean b=check("AbcbA");
        if(b==true){
            System.out.println("Palandrome");
        }else{
            System.out.println("Not a palandrome");
        }
    }
}
