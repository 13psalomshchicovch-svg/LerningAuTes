package Lesson5;

class BankAccount {

    BankAccount( int Id1, String name1, String surname1, double balance1) {
        Id = Id1;
        name = name1;
        surname = surname1;
        balance = balance1;
    }
    int Id;
    String name;
    String surname;
    double balance;

    double popolnenieScheta(double d1){
        balance += d1;
        return balance;
    }

    double snaytieSoScheta(double d1){
        balance -= d1;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount n1 = new BankAccount(1, "Roman","Nevsliy", 0.0);
        n1.popolnenieScheta(2.2);
        n1.snaytieSoScheta(1);
        System.out.println(n1.balance);


    }

        }