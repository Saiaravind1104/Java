public class SpritString {
    public static void main(String[] args) {
        String a="Aravindh";
        int b=a.length();
        char c,e;
        String d="";
        String g="";
        int f=((b/2)-1);
        if(b%2==0){
            for(int i=0;i<=f;i++){
                System.out.println("i = "+i);

                c=a.charAt(i);
                d=c+d;
            }for(int j=(f+1);j<=(b-1);j++){
                System.out.println("j = "+j);

                e=a.charAt(j);
                g=e+g;
            }
            System.out.println(d+g);

        }else{
            String v=a+"a";
            System.out.println(v);

            for(int i=0;i<=f;i++){

                c=a.charAt(i);
                d=c+d;
            }for(int j=(f+1);j<=(b-1);j++){

                e=a.charAt(j);
                g=e+g;
            }
            System.out.println(d+g);
        }
    }

}
