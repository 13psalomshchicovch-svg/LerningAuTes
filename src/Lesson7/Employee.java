package Lesson7;

public class Employee{

    int Id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int Id1, String surname1, int age1, double salary1, String department1) {
       Id = Id1;
       surname = surname1;
       age = age1;
       salary = salary1;
       department = department1;
    }
    private Employee(int Id1, String surname1, int age1, double salary1) {
        this(Id1,surname1,age1, salary1, null);
    }

    Employee(int Id1, String surname1, int age1) {
        this(Id1,surname1,age1, 0, null);
    }

    public void ViewSalary(){
        System.out.println("зарплата = " + salary);
    }

    public void ViewId(){
        System.out.println("Id = " + Id);
    }

    public void ViewSurname(){
        System.out.println("фамилия = " + surname);
    }

    double DoubleSalary(double b){
        double a;
        a = b*2;
        return a;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee n1 = new Employee(1,"Kirisheev",47, 955.0, "IT");

        Employee n2 = new Employee(2,"Shymskaia",35, 1100.0, "Manager");

    }

}