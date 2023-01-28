package SystemClass.ObjectClass;

public class EmployeeDetails  extends Employee{
    public EmployeeDetails(String employeeName, String employeeCompany, int age, double salary, int employeeId) {
        super(employeeName, employeeCompany, age, salary, employeeId);
    }


    public static void main(String[] args) {
        EmployeeDetails aravind=new EmployeeDetails("Aravind","Microsoft",23,50000.00,1234);
        EmployeeDetails vaishu=new EmployeeDetails("Vaishu","Facebook",22,50000.00,5678);
        System.out.println(aravind.toString());
        System.out.println(vaishu.toString());
        System.out.println("Employee id = "+aravind.hashCode());
        System.out.println("Employee id = "+vaishu.hashCode());
        System.out.println(aravind.equals(vaishu));
        Object o1=new Employee("niha","IB",22,33000.00,143);
        Employee e1=(Employee)o1;
        System.out.println(e1.toString());
        Object o2=new EmployeeDetails("maahi","google",10,25000.00,7989);
        EmployeeDetails e2=(EmployeeDetails)o2;
        System.out.println(e2.toString());
    }
}
