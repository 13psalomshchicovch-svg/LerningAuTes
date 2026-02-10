package Lesson5;

class Employee{
    Employee(int Id1, String surname1, int age1, double salary1, String department1) {
       Id = Id1;
       surname = surname1;
       age = age1;
       salary = salary1;
       department = department1;
    }
    int Id;
    String surname;
    int age;
    double salary;
    String department;

    double DoubleSalary(double b){
        double a;
        a = b*2;
        return a;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee n1 = new Employee(1,"Kirisheev",47, 955.0, "IT");
         System.out.println(n1.DoubleSalary(n1.salary));
        Employee n2 = new Employee(2,"Shymskaia",35, 1100.0, "Manager");
        System.out.println(n2.DoubleSalary(n2.salary));
    }

}