package bankAccount;

public class Message {
    void accountTypeConfirmation() {
        System.out.println();
        System.out.println("Select account type for an operation");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("0. Exit");
        System.out.println();

    }

    void taskConfirmation() {
        System.out.println();
        System.out.println("Enter 1 to create a new account");
        System.out.println("Enter 2 to deposit money");
        System.out.println("Enter 3 to withdraw money");
        System.out.println("Enter 4 to display account details");
        System.out.println("Enter 5 to display all savings accounts");
        System.out.println("Enter 6 to display all current accounts");
        System.out.println("Enter 7 to display all accounts");
        System.out.println("Enter 8 to display transaction history");
        System.out.println("Enter 0 to exit");
        System.out.println();

    }
}
