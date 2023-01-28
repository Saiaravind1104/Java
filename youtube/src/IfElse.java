public class IfElse {
    public static void main(String[] args){
         int score =10000,
                 levelComplete=8,bonus=200;
         score =20;
         String name2="Niha";
         int number =25;
         int a =name1();

         name2("Aravind",name2,number);
         boolean gameover=true;
         if (gameover == true){
             int finalScore=score+(levelComplete*bonus);
             System.out.println("Your final score was = "+ finalScore);
         }

        }
    public static int name1(){
        int num =20;
        String b="Maahi";
        System.out.println(b);
        System.out.println("Number ="+num);
        return num;
    }

    public static void name2(String name1,String name2,int number){
        System.out.println("Name = "+name1);
        System.out.println("Name = "+name2);
        System.out.println("Number1 = "+number);


    }
}

