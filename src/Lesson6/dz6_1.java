package Lesson6;

class Overloaded {

    int a;
    int b;
    int c;
    int d;

    int over(){
        int x;
        x = 0;
        return x;
    }

    int over(int a1){
        int x;
        a = a1;
        x = a;
        return x;
    }

    int over(int a1, int b1){
        int x;
        a = a1;
        b = b1;
        x = a + b1;
        return x;
    }

    int over(int a1, int b1, int c1){
        int x;
        a = a1;
        b = b1;
        c = c1;
        x = a + b + c;
        return x;
    }

    int over(int a1, int b1, int c1, int d1){
        int x;
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        x = a + b + c + d;
        return x;
    }

}

class  OverLoudedTest {
    public static void main(String[] args) {
        Overloaded n1 = new Overloaded();
        System.out.println(n1.over(1,7,12,25));
    }

}