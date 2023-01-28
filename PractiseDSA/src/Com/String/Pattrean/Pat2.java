package Com.String.Pattrean;

public class Pat2 {
    public static void main(String[] args) {
        String str="ABCD";
        String pat="BC";
        int m=str.length();
        int n=pat.length();
        for(int i=0;i<str.length()-pat.length();i++){

            int j;
            for(j=0;j<pat.length();j++){

                if(pat.charAt(j)!=str.charAt(i+j)){
                    break;
                }
                if(pat.length()==j){
                    System.out.println(i);
                }
            }
        }
    }
}
