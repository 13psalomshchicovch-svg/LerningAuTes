package Lesson4;

public class Student {
    public int NSB;
    public String name;
    public String surname;
    int yers;
    double math_mark;
    double econ_mark;
    double fl_mark;

    public Student(int NSB1, String name1, String surname1, int yers1, double math_mark1, double econ_mark1, double fl_mark1){
        NSB = NSB1;
        name = name1;
        surname = surname1;
        yers = yers1;
        math_mark = math_mark1;
        econ_mark = econ_mark1;
        fl_mark = fl_mark1;
    }

    public Student(int NSB2, String name2, String surname2, int yers2){
        this(NSB2,name2,surname2,yers2, 0.0, 0.0, 0.0);
            }

    public Student(){
        this(0,null,null,0,0.0,0.0,0.0);
   }


    public void AVG(){
        double AVG;
        AVG = (econ_mark+fl_mark+math_mark)/3;
        System.out.println(name + " " + surname + " NSB " + NSB + " AVG mark's " + AVG);
    }

}
class StudentTest{
    public static void main(String[] args) {



        Student n1 = new Student(1, "Ivan", "Cherkov", 2015, 4.4, 4.1, 3.7);
            n1.AVG();

        Student n2 = new Student(2, "Vladimir", "Veshkin", 2013);
            n2.AVG();

        Student n3 = new Student();
            n3.AVG();
    }


}