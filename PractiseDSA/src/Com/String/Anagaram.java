package Com.String;

public class Anagaram {
    public static void main(String[] args) {
        String s1="aravind";
        String s2="araVind";
        int len1=s1.length();
        int len2=s2.length();
        if(len1==len2) {
            int[] count = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }
            boolean status = true;
            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    status = false;
                }
            }
            if (status) {
                System.out.println("Anagaram");
            } else {
                System.out.println("Not a Anagaram");
            }
        }
        else{
            System.out.println("Not a anagram");
        }
    }
}
