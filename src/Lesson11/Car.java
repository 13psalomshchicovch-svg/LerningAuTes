package Lesson11;

public class Car {
    String motor;
    String color;
    int dveri;

    Car (){}

    Car (String motor, String color, int dveri){
        this.motor = motor;
        this.color = color;
        this.dveri = dveri;
    }

    public static void main(String[] args) {
        Car a1 = new Car("V4","blue",4);
        Car a2 = new Car("V6","red",6);
        CarTest.chaingeDors(a1, 3);
        System.out.println(a1.dveri);
        CarTest.chaingeColor(a1, a2);
        System.out.println(a1.color);
    }
}
class CarTest{

    public static void chaingeDors(Car c1, int d){
        c1.dveri = d;
    }

    public static void chaingeColor(Car c1, Car c2){
        Car c3 = new Car();
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }
}