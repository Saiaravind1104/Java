package SystemClass.ObjectClass;

import java.util.Objects;

public class Employee {
    public String employeeName;
    public String employeeCompany;
    public int age;
    public double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeCompany='" + employeeCompany + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Employee e=(Employee) o;
        return this.salary==e.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    public Employee(String employeeName, String employeeCompany, int age, double salary, int employeeId) {
        this.employeeName = employeeName;
        this.employeeCompany = employeeCompany;
        this.age = age;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public int employeeId;
}
