package Lesson8;

public class dz8_2 {
    final static double Pi = 3.14;

    double ploshad(double r) {
        double s;
        s = Pi * r * r;
        return s;
    }
    static double dlina(double r) {
        double l;
        l = 2 * Pi * r;
        return l;
    }

    void Viewinfo(double r){
        System.out.println("r = "+r+", s = "+ploshad(r)+", l = "+dlina(r));
    }

}
class zadatR{
    public static void main(String[] args) {
        dz8_2 n1 = new dz8_2();
        n1.Viewinfo(3);
    }
}