package Com.Hirecy;

public class Developer extends Employee {
    public String lang1;
    public String lang2;
    public String lang3;


    Developer(int id,String name,double salary,String lang1,String lang2,String lang3){
        super(id,name,salary);
        this.lang1=lang1;
        this.lang2=lang2;
        this.lang3=lang3;
    }

    public void displayDeveloper(){
        System.out.println("Language 1 = "+lang1);
        System.out.println("Language 2 = "+lang2);
        System.out.println("Language 3 = "+lang3);
    }
}
