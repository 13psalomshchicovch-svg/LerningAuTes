package Lesson7;

public class dz7_1 {
    public static void main(String[] args) {

        Employee n1 = new Employee(1,"Kirisheev",47, 955.0, "IT");
            n1.ViewSalary();
            System.out.println(n1.Id);
            n1.ViewId();
            System.out.println(n1.surname);
            n1.ViewSurname();

        Employee n2 = new Employee(2,"Shymskaia",35);
            n2.ViewSalary();
            System.out.println(n1.Id);
            n2.ViewId();
            System.out.println(n1.surname);
            n2.ViewSurname();
    }
}
