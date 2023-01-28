public class revpal {
    public static void main(String[] args) {
        String a="ara";
        String string="";
        String str="";
        String store="";
        boolean status=false;
        int count=0;
        for(int i=0;i<=0;i++){
            char b=a.charAt(i);
            string=b+string;
            str=str+b;
            System.out.println("Loop "+i+" = "+str);
            System.out.println("Loop "+i+" = "+string);

        }if(string==str){
            System.out.println("Paladrome");
        }else{
            System.out.println("Not Paladrome");
        }

    }
}
