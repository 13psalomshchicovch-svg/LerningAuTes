package Lesson7.dz;

import Lesson7.Employee;

public class dz7_2 {
    public static void main(String[] args) {
        Lesson7.Employee n1 = new Employee(1,"Kirisheev",47, 955.0, "IT");
            n1.ViewSalary();
            n1.ViewId();
            System.out.println(n1.surname);
            n1.ViewSurname();


    }
}
