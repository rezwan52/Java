
public class BankAccount {

    String name, accNum;
    double balance;

    BankAccount(String name, String accNum, double balance) {

        this.name = name;
        this.accNum = accNum;
        this.balance = balance;

    }

    public void deposit(double depAmount) {
        if (depAmount > 0) {
            balance += depAmount;
        }
    }

    public void withdraw(double withAmount) {
        if (withAmount <= balance) {
            balance -= withAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String accNum() {
        return accNum;
    }

    void display() {
        System.out.println("Name: " + name + " AccNum: " + accNum + " Balance: " + balance);
    }

    public String toString() {
        return name + " - " + accNum + " : " + balance;
    }

}