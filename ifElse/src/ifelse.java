public class ifelse {
    public static void main(String[] args){
        int a=20;
        double b=20.00d;
        float c=(float) b;
        System.out.println(c);
        if (a>b){
            System.out.println(a);
        }
        else if(a==b){
            System.out.println("a=b");
        }
        else{
            System.out.println(c);
        }
        //short hand
        String shorthand=(10<20)? "20": "10";
        System.out.println("Short hand if else: "+shorthand);


    }
}
