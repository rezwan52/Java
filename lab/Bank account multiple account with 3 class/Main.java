
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bank primeBank = new Bank();

        primeBank.showMessage();
        int indicator = scan.nextInt();
        System.out.println();

        while (indicator != 0) {
            if (indicator == 2) {
                System.out.println("Please Enter account number: ");
                String accNo = scan.next();

                System.out.println("Please Enter deposit ammount: ");
                double ammount = scan.nextDouble();

                primeBank.deposit(accNo, ammount);

            } else if (indicator == 3) {

                System.out.println("Please Enter account number: ");
                String accNo = scan.next();
                System.out.println("Please Enter withdraw ammount: ");
                double ammount = scan.nextDouble();

                primeBank.withdraw(accNo, ammount);

            } else if (indicator == 4) {

                System.out.println("Please Enter account number: ");
                String accNo = scan.next();

                primeBank.getBalance(accNo);

            } else if (indicator == 5) {
                System.out.println("Please Enter account number: ");
                String accNo = scan.next();

                primeBank.accountInfo(accNo);

            } else if (indicator == 1) {
                String name, newAccNum;
                double balance;

                name = JOptionPane.showInputDialog("Enter your name : ");
                newAccNum = JOptionPane.showInputDialog("Enter bank account Number: ");

                System.out.println("Enter your initial balance: ");
                balance = scan.nextDouble();
                primeBank.createAccount(name, newAccNum, balance);

            } else if (indicator == 6) {

                primeBank.showAll();

            }

            primeBank.showMessage();
            indicator = scan.nextInt();
            System.out.println();
        }

        scan.close();
    }

}
