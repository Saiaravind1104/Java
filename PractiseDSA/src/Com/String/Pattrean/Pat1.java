package Com.String.Pattrean;

public class Pat1 {
    public static void main(String[] args) {
        String str="ABCDABCDCC";
        String pat="ABC";
        int lenstr=str.length();
        int lenpat=pat.length();
        for(int i=0;i<=lenstr-lenpat;){
            int j;
            for(j=0;j<lenpat;j++){
                if(str.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==lenpat){
                System.out.print(i+" ");
            }
            if(j==0){
                i++;
            }else{
                i=(i+j);
            }
        }
    }
}
