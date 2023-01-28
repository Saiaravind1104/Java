public class strings {
    public static void main(String[] args){
        String a="I Am Sai aravind";
        String l=a.trim();
        System.out.println(a);
        System.out.println("Length = "+a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(l.indexOf("aravind"));
        String txt = "Please locate where locate occurs!";
        System.out.println(txt.indexOf("locate"));
        System.out.println(a.charAt(3));
        String c="sai",b="sai";
        System.out.println(c==b);
        //System.out.println(a.split(1));

    }
}
