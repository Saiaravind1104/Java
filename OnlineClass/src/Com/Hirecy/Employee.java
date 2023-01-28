package Com.Hirecy;

public class Employee {
    public int id;
    public String name;
    public double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}
