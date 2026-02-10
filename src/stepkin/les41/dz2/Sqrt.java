package stepkin.les41.dz2;

public class Sqrt {
    public static void main(String[] args) {

        System.out.println(Sqrt.sqrt(-2));
    }

    public static double sqrt(double x) {
        if (x>=0){
            return Math.sqrt(x);
        }
        else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }// your implementation here
    }
}
