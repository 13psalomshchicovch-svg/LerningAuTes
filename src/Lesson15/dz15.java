package Lesson15;

class Clock{

    public static void workClock (){
    int h = -1;

    OUTER:
    while (h < 6) {
        h++;
        int m = -1;
            MIDDLE:
            do {
                m++;
                int s = -1;

            if (h > 1 &&  m % 10 == 0) {
                    break OUTER;
                }

            else {

                    INNER:
                    while ( s < 59) {
                        s++;

                        if ((h*s)> m){
                            continue MIDDLE;
                            }

                        else {
                            System.out.println(h + ":" + m + ":" + s);
                            }

                        }
                    }

                } while (m < 59);

        }
    }
}

public class dz15 {
    public static void main(String[] args) {
        Clock.workClock();
    }
}
