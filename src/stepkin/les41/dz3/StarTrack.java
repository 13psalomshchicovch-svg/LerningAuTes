package stepkin.les41.dz3;

import java.util.Arrays;

public class StarTrack {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
           }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
           }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());

    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] methods;
        methods = new Throwable().getStackTrace();

        if (methods.length>2){
            return methods[2].getClassName()+"#"+methods[2].getMethodName();
        }
        return null; // your implementation here
    }


}
