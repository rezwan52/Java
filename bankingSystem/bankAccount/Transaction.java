package bankAccount;

public class Transaction {
    String type;
    double amount;
    String date;

    Transaction(String type, double amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;

    }

    void displayTransaction() {
        System.out.println("Transaction type: " + type + ", Amount: " + amount + ", Date: " + date);

    }

}
