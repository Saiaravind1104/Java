package Polymerphism;
class Demo{
    public static void sample(){
        System.out.println("Zero Arguments");
    }
    public static void sample(int a){
        System.out.println("Arguments = 1");
    }
    public static void sample(int a,int b){
        System.out.println("Arguments = 2");
    }

}
public class CompileTime {
    public static void main(String[] args) {
       Demo.sample();
       Demo.sample(1);
       Demo.sample(1,2);
    }

}
