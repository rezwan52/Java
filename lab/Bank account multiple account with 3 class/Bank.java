
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    Scanner scan = new Scanner(System.in);
    ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public void showMessage() {
        System.out.println();
        System.out.println("Enter 1 to create new account.");
        System.out.println("Enter 2 to deposit money. ");
        System.out.println("Enter 3 to withdraw money. ");
        System.out.println("Enter 4 to get balace of specific account. ");
        System.out.println("Enter 5 to view specific account info.");
        System.out.println("Enter 6 to show all account's info.");
        System.out.println("Enter 0 to exit the program. ");

    }

    public void createAccount(String name, String newAccNum, double balance) {

        Boolean alreadyExist = false;

        for (BankAccount acc : bankAccounts) {
            if (acc.accNum.equals(newAccNum)) {
                alreadyExist = true;
            }
        }

        if (alreadyExist) {
            JOptionPane.showMessageDialog(null, "Account already exist");

        } else {
            BankAccount newAccount = new BankAccount(name, newAccNum, balance);
            bankAccounts.add(newAccount);
        }

    }

    public void deposit(String accNo, double ammount) {
        for (BankAccount acc : bankAccounts) {
            if (acc.accNum().equals(accNo)) {
                acc.deposit(ammount);
            }
        }

    }

    public void withdraw(String accNo, double ammount) {

        for (BankAccount acc : bankAccounts) {
            if (acc.accNum().equals(accNo)) {
                acc.withdraw(ammount);
            }
        }
    }

    public void getBalance(String accNo) {
        for (BankAccount acc : bankAccounts) {
            if (acc.accNum().equals(accNo)) {
                System.out.println("Your Balance is : " + acc.getBalance());
            }
        }
    }

    public void accountInfo(String accNo) {
        for (BankAccount acc : bankAccounts) {
            if (acc.accNum().equals(accNo)) {
                System.out.println("Your Account informations are- ");
                System.out.println(acc.toString());
            }
        }
    }

    public void showAll() {
        if (bankAccounts.size() == 0) {
            JOptionPane.showMessageDialog(null, "There is no Bank account, Please create account.");
        }

        for (int i = 0; i < bankAccounts.size(); i++) {
            System.out.println("Account informations of user-" + (i + 1) + " are: ");
            System.out.println(bankAccounts.get(i).toString());
        }
    }

}
