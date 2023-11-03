package bankAccount;

import java.util.Random;

class BankAccount {
    private String memberName, accountNumber;
    private double accountBalance, minimumBalance;

    // constructor
    public BankAccount(String memberName, double accountBalance, double minimumBalance) {
        this.memberName = memberName;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;

        // auto generate a 5 digit account number
        Random rand = new Random();
        this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10)
                + rand.nextInt(10);
    }

    // deposit money
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            return true;
        }
        return false;
    }

    // withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && this.accountBalance - amount >= this.minimumBalance) {
            this.accountBalance -= amount;
            return true;
        }

        return false;
    }

    // get account number
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // get account balance
    public double getAccountBalance() {
        return this.accountBalance;
    }

    // get minimum balance
    public double getMinimumBalance() {
        return this.minimumBalance;
    }

    // get member name
    public String getMemberName() {
        return this.memberName;
    }

    // set minimum balance
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    // set member name
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // set account balance
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // display account details
    @Override
    public String toString() {
        return "Member name: " + this.memberName + ", " + "Account number: " + this.accountNumber + ", "
                + "Account balance: "
                + this.accountBalance + ", " + "Minimum balance: " + this.minimumBalance;

    }
}