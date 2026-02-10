package Lesson9;

class zavod{

    static int s; // static variable
    int chisloRabochih; //instance variable
    String chtoProizvodit;
    String nazvanieZavoda;
    int koefitcientProizvodstva;

    public int show_Vlianie_Raoshih(int a){ //parametr (a)
        String colixhestvoProdycta; // local variable

        if (a<chisloRabochih){
            colixhestvoProdycta = "malo";
            return 1;
        }

        else if (a == chisloRabochih) {
            colixhestvoProdycta = "norma";
            return 2;
        }

        else {
            colixhestvoProdycta = "mnogo";
            return 3;
        }
    }

    public void showVino(String a){
            int b;
            zavod c = new zavod();
            c.koefitcientProizvodstva = 4;
            b = c.koefitcientProizvodstva;

            System.out.println(a + b);
    }

    public void smenaZavoda(zavod a, zavod b){
        zavod c1 = a;
        zavod c2 = b;
        zavod c3;

        c3 = c2;
        c2 = c1;
        c1 = c3;

        System.out.println(c1.nazvanieZavoda);
        System.out.println(c2.nazvanieZavoda);
    }

}

public class dz_9 {
    public static void main(String[] args) {
    zavod z1 = new zavod();
    zavod z2 = new zavod();
    zavod z3 = new zavod();

    z1.nazvanieZavoda = "vino";
    z2.nazvanieZavoda = "tabak";
    z3.nazvanieZavoda = "pivo";



    z1.koefitcientProizvodstva =4;

    z1.showVino(z1.nazvanieZavoda);

    z1.smenaZavoda(z1, z2);

        System.out.println(z1.nazvanieZavoda);
        System.out.println(z2.nazvanieZavoda);

        z3 = z2;
        z2 = null;
    z3.smenaZavoda(z1, z3);
        System.out.println(z3.nazvanieZavoda);
    }
}
