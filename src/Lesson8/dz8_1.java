package Lesson8;

class dz8_1 {

    static double slosh(int a1, int b1, int c1){
        int x;
        x = a1 * b1 * c1;
        return x;
    }

    static void del(int a1, int b1){
        System.out.println("Целое часное = " + (a1/b1) + ", Остаток от деления = " + a1%b1);
    }
}
class test {
    public static void main(String[] args) {
        dz8_1 n1 = new dz8_1();
        System.out.println(n1.slosh(1,2,3));
        n1.del(5,3);
        dz8_1 n2 = new dz8_1();
        System.out.println(n2.slosh(2,3,4));
        n2.del(7,3);
    }
}