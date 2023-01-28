public class typecasting1 {

        public static void main(String[] args){
            System.out.println("Automatic Conversion");
            char a='a';
            int b=a;
            double c=(a);
            System.out.println("integer =" +b);
            System.out.println("Double =" +c);
            System.out.println("Manual Conversion");
            double d=2.20d;
            int e=(int)d;
            char f=(char) e;
            System.out.println("integer =" +e);
            System.out.println("character =" +f);
            char x='c';
            x = 87;
            System.out.println(x);
        }
    }


