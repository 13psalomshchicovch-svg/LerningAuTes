package Lesson14;

class Clock{

    public static void workClock (){

    OUTER:
    for (int h = 0; h < 6; h++) {

            MIDDLE:
            for (int m = 0; m < 60; m++) {

            if (h > 1 &&  m % 10 == 0) {
                    break OUTER;
                }

            else {
                    INNER:
                    for (int s = 0; s < 60; s++) {

                        if ((h*s)> m){
                        continue MIDDLE;
                        }

                        else {
                        System.out.println(h + ":" + m + ":" + s);
                        }
                    }
                }
            }

    }

    }
}

public class dz14 {
    public static void main(String[] args) {
        Clock.workClock();


    }
}
