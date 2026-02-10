package Lesson12;

class Student{
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

}


public class dz12 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3,4.7);
        Student st2 = new Student("Petr", 1,4.3);
        Student st3 = new Student("Ivan", 3,4.7);

        if ((st1.name.equals(st2.name)) && (st1.course == st2.course) && (st1.grade == st2.grade)){
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }


        if (st1.name.equals(st2.name)){
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("equals");
                }
                else {
                    System.out.println("not equals because grade");
                }
            }
            else {
                System.out.println("not equals because course");
            }
            }
        else { System.out.println("not equals because name");
        }
    }
}