package bankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Message message = new Message();
        int choice, choice2;

        // create a arraylist of bank accounts
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // create a hashmap for transactions history
        HashMap<String, ArrayList<Transaction>> transactions = new HashMap<String, ArrayList<Transaction>>();

        // create a menu
        message.accountTypeConfirmation();
        choice = scan.nextInt();
        message.taskConfirmation();
        choice2 = scan.nextInt();

        while (choice != 0 && choice2 != 0) {
            if (choice == 1) {
                // block for savings account
                if (choice2 == 1) {
                    // create a new account
                    String memberName = JOptionPane.showInputDialog("Enter member name");
                    System.out.println("Enter account balance");
                    double accountBalance = scan.nextDouble();
                    System.out.println("Enter max withdraw limit");
                    double maxWithLimit = scan.nextDouble();

                    if (accountBalance >= 2000 && memberName.length() > 0 && maxWithLimit >= 0) {

                        SavingsAccount account = new SavingsAccount(memberName, accountBalance, maxWithLimit);
                        accounts.add(account);

                        // add transaction to the hashmap

                        ArrayList<Transaction> transactionList = transactions.get(account.getAccountNumber());
                        LocalDateTime now = LocalDateTime.now();

                        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                        String date = now.format(format);

                        if (transactionList == null) {
                            transactionList = new ArrayList<Transaction>();
                            transactionList.add(new Transaction("Deposit", accountBalance, date));

                            transactions.put(account.getAccountNumber(), transactionList);

                        } else {
                            transactionList.add(new Transaction("Deposit", accountBalance, date));
                            transactions.put(account.getAccountNumber(), transactionList);
                        }

                        // printing success message

                        System.out.println("Account created successfully");
                        System.out.println("Account number is " + account.getAccountNumber());
                    } else {
                        System.out.println("Account creation failed");
                        if (accountBalance < 2000) {
                            System.out.println("Minimum balance is 2000.");
                        }

                        if (memberName.length() == 0) {
                            System.out.println("Name is required.");
                        }
                        if (maxWithLimit < 0) {
                            System.out.println("Max withdraw limit must be positive.");
                        }

                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 2) {
                    // deposit money
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    System.out.println("Enter amount to deposit");
                    double amount = scan.nextDouble();

                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            if (account.deposit(amount)) {

                                // add transaction to the hashmap
                                ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                                LocalDateTime now = LocalDateTime.now();

                                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                                String date = now.format(format);

                                if (transactionList == null) {
                                    transactionList = new ArrayList<Transaction>();
                                    transactionList.add(new Transaction("Deposit", amount, date));

                                    transactions.put(accountNumber, transactionList);

                                } else {
                                    transactionList.add(new Transaction("Deposit", amount, date));
                                    transactions.put(accountNumber, transactionList);
                                }

                                // printing success message
                                System.out.println("Amount deposited successfully");
                            } else {
                                System.out.println("Deposit failed");
                            }

                        }
                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 3) {
                    // withdraw money
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    System.out.println("Enter amount to withdraw");
                    double amount = scan.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            if (account.withdraw(amount)) {

                                // add transaction to the hashmap
                                ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                                LocalDateTime now = LocalDateTime.now();

                                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                                String date = now.format(format);

                                if (transactionList == null) {
                                    transactionList = new ArrayList<Transaction>();
                                    transactionList.add(new Transaction("Withdraw", amount, date));

                                    transactions.put(accountNumber, transactionList);

                                } else {
                                    transactionList.add(new Transaction("Withdraw", amount, date));
                                    transactions.put(accountNumber, transactionList);
                                }

                                // printing success message
                                System.out.println("Amount withdrawn successfully");
                            } else {
                                System.out.println("Withdraw failed");
                            }

                        }
                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 4) {
                    // display account details
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 5) {
                    // display all savings accounts
                    System.out.println("Savings accounts");
                    for (BankAccount account : accounts) {
                        if (account instanceof SavingsAccount) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 6) {
                    // display all current accounts
                    System.out.println("Current accounts");
                    for (BankAccount account : accounts) {
                        if (account instanceof CurrentAccount) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 7) {
                    // display all accounts
                    System.out.println("All accounts");
                    for (BankAccount account : accounts) {
                        System.out.println(account.toString());
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 8) {
                    // display transaction history
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                    if (transactionList == null) {
                        System.out.println("No transaction history found");
                    } else {
                        System.out.println("Transaction history");
                        for (Transaction transaction : transactionList) {
                            transaction.displayTransaction();
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                }

                else {
                    System.out.println("Invalid choice");
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                }

            } else if (choice == 2) {
                // block for current account
                if (choice2 == 1) {
                    // create a new account
                    String memberName = JOptionPane.showInputDialog("Enter member name");
                    String tradeLicenseNumber = JOptionPane.showInputDialog("Enter Trade License Number");
                    System.out.println("Enter account balance");
                    double accountBalance = scan.nextDouble();

                    if (accountBalance >= 5000 && tradeLicenseNumber.length() > 0 && memberName.length() > 0) {
                        CurrentAccount account = new CurrentAccount(memberName, accountBalance, tradeLicenseNumber);
                        accounts.add(account);

                        // add transaction to the hashmap

                        ArrayList<Transaction> transactionList = transactions.get(account.getAccountNumber());
                        LocalDateTime now = LocalDateTime.now();

                        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                        String date = now.format(format);

                        if (transactionList == null) {
                            transactionList = new ArrayList<Transaction>();
                            transactionList.add(new Transaction("Deposit", accountBalance, date));

                            transactions.put(account.getAccountNumber(), transactionList);

                        } else {
                            transactionList.add(new Transaction("Deposit", accountBalance, date));
                            transactions.put(account.getAccountNumber(), transactionList);
                        }

                        // printing success message
                        System.out.println("Account created successfully");
                        System.out.println("Account number is " + account.getAccountNumber());
                    } else {
                        System.out.println("Account creation failed.");
                        if (accountBalance < 5000)
                            System.out.println("Minimum balance is 5000.");
                        if (tradeLicenseNumber.length() == 0)
                            System.out.println("Trade license number is required.");
                        if (memberName.length() == 0)
                            System.out.println("Member name is required.");

                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 2) {
                    // deposit money
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    System.out.println("Enter amount to deposit");
                    double amount = scan.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            if (account.deposit(amount)) {

                                // add transaction to the hashmap
                                ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                                LocalDateTime now = LocalDateTime.now();

                                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                                String date = now.format(format);

                                if (transactionList == null) {
                                    transactionList = new ArrayList<Transaction>();
                                    transactionList.add(new Transaction("Deposit", amount, date));

                                    transactions.put(accountNumber, transactionList);

                                } else {
                                    transactionList.add(new Transaction("Deposit", amount, date));
                                    transactions.put(accountNumber, transactionList);
                                }

                                // printing success message

                                System.out.println("Amount deposited successfully");
                            } else {
                                System.out.println("Deposit failed");
                            }
                        }
                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 3) {
                    // withdraw money
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    System.out.println("Enter amount to withdraw");
                    double amount = scan.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            if (account.withdraw(amount)) {

                                // add transaction to the hashmap
                                ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                                LocalDateTime now = LocalDateTime.now();

                                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");

                                String date = now.format(format);

                                if (transactionList == null) {
                                    transactionList = new ArrayList<Transaction>();
                                    transactionList.add(new Transaction("Withdraw", amount, date));

                                    transactions.put(accountNumber, transactionList);

                                } else {
                                    transactionList.add(new Transaction("Withdraw", amount, date));
                                    transactions.put(accountNumber, transactionList);
                                }

                                // printing success message
                                System.out.println("Amount withdrawn successfully");
                            } else {
                                System.out.println("Withdraw failed");
                            }

                        }
                    }

                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 4) {
                    // display account details
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumber)) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();

                } else if (choice2 == 5) {
                    // display all savings accounts
                    System.out.println("Savings accounts");
                    for (BankAccount account : accounts) {
                        if (account instanceof SavingsAccount) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 6) {
                    // display all current accounts
                    System.out.println("Current accounts");
                    for (BankAccount account : accounts) {
                        if (account instanceof CurrentAccount) {
                            System.out.println(account.toString());
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 7) {
                    // display all accounts
                    System.out.println("All accounts");
                    for (BankAccount account : accounts) {
                        System.out.println(account.toString());
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                } else if (choice2 == 8) {
                    // display transaction history
                    System.out.println("Enter account number");
                    String accountNumber = scan.next();
                    ArrayList<Transaction> transactionList = transactions.get(accountNumber);
                    if (transactionList == null) {
                        System.out.println("No transaction history found");
                    } else {
                        System.out.println("Transaction history");
                        for (Transaction transaction : transactionList) {
                            transaction.displayTransaction();
                        }
                    }
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                }

                else {
                    System.out.println("Invalid choice");
                    // create a menu
                    message.accountTypeConfirmation();
                    choice = scan.nextInt();
                    message.taskConfirmation();
                    choice2 = scan.nextInt();
                }

            } else {
                System.out.println("Invalid choice");
                // create a menu
                message.accountTypeConfirmation();
                choice = scan.nextInt();
                message.taskConfirmation();
                choice2 = scan.nextInt();
            }

        }

        scan.close();
    }
}