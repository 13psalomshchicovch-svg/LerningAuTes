package Lesson10.p4.p5;
import Lesson10.p1.*;
import Lesson10.p1.p2.*;
import Lesson10.p1.p2.p3.*;
import Lesson10.p4.*;
public class E {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        D d = new D();
        String test = B.s;
        a.showPac();
        c.showPac();
        d.showPac();
        System.out.println(test);

    }
    public void showPac(){
        System.out.println("THIS C");
    }
}

