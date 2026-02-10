package stepkin.les35.dz;

import java.util.function.DoubleUnaryOperator;

public class calcIntegral {

//метод левых прямоугольников

    public static void main(String[] args) {
//        System.out.println(integrate(x -> 1, 0, 10));//10.0
       System.out.println(integrate(x -> x + 2, 0, 10));//70.0
//        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 1_000_000;
        double h = (b-a) / n;

        double result = 0;

        for (double x = a; x < b; x+=h) {
            result += f.applyAsDouble(x) * h;
        }
        return result;
    }

//    public static double integrate(DoubleUnaryOperator f, double a, double b, double h) {
//        int n = 1_000_000;
//
//        double result2 = 0;
//        double result = 0;
//
//        for (double x = a; x < b; x+=h) {
//            result += f.applyAsDouble(x) * h;
//        }
//
//        for (double x = a; x < b; x+=(h/2)) {
//            result2 += f.applyAsDouble(x) * (h/2);
//        }



    }


