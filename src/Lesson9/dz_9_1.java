package Lesson9;

public class dz_9_1 {
   int a =1;
   static int b=2;
    void abc(final int a) {
       System.out.println(b);
       System.out.println(a);
       System.out.println(this.a);
        System.out.println(dz_9_1.b);
   }

    public static void main(String[] args) {
        dz_9_1 d = new dz_9_1();
        d.abc(4);
    }
}
