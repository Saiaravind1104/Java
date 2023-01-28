package Com;
interface  Sum{
    int sum();
}
abstract  class Average{
    public abstract double average();

    public void phoneNumber(String phoneNumber) {
        System.out.println("Phone Number = "+phoneNumber);
    }

}
class Inheritance2 extends  Inheritance{
    private String parentsName;

    public String getParentsName() {
        return parentsName;
    }

    Inheritance2(int mark1, int mark2, int mark3, String name, String parentsName){
        super(mark1,mark2,mark3,name);
        this.parentsName=parentsName;
    }
}
class Inheritance extends Average{
    private int mark1;
    private int mark2;
    private int mark3;
    private String name;

    Inheritance(int mark1,int mark2,int mark3,String name){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public int getMark1() {
        return mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public String getName() {
        return name;
    }


    public int sum(int mark1,int mark2,int mark3){
        return (mark1+mark2+mark3);
    }

    public void phoneNumber(String phoneNumber) {
        System.out.println("Phone Number = "+phoneNumber);
    }
    @Override
    public double average(){
        double temp=(mark1+mark2+mark3)/3;
        return temp;
    }
}
public class OOPs {
    public static void main(String[] args) {
        Inheritance i1=new Inheritance(200,100,100,"Aravind");
        double b=i1.average();
        System.out.println("Average = "+b);

        Inheritance2 i2=new Inheritance2(200,100,100,"Aravind","BalaRaju");
        int c=i2.getMark1();
        System.out.println(c);
    }
}
