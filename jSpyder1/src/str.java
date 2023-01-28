public class str {
    public static void main(String[] args) {
        String s="aaabche";
        int len=s.length();
        char st=' ';
        int count1=1;
        boolean status =false;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(st==ch){
                status =false;
                ++count1;
            }else{
                status=true;
                count1=1;
            }
            for(char j='a';j<='z';j++){
                if(ch==j){
                    st=ch;
                }
            }

        }
    }
}
