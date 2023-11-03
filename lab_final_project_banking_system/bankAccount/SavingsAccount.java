package bankAccount;

public class SavingsAccount extends BankAccount {

    private double interestRate, maxWithLimit;

    // constructor
    public SavingsAccount(String memberName, double accountBalance, double maxWithLimit) {
        super(memberName, accountBalance, 2000);
        this.interestRate = 0.05;
        this.maxWithLimit = maxWithLimit;
    }

    // withdraw money
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.maxWithLimit
                && this.getAccountBalance() - amount >= this.getMinimumBalance()) {
            this.setAccountBalance(this.getAccountBalance() - amount);
            return true;

        }
        return false;
    }

    // calculate interest
    private double calculateInterest() {
        return this.getAccountBalance() * this.interestRate;
    }

    // get net balance
    public double getNetBalance() {
        return this.getAccountBalance() + this.calculateInterest();
    }

    // get interest rate
    public double getInterestRate() {
        return this.interestRate;
    }

    // get max withdraw limit
    public double getMaxWithLimit() {
        return this.maxWithLimit;
    }

    // set max withdraw limit
    public void setMaxWithLimit(double maxWithLimit) {
        this.maxWithLimit = maxWithLimit;
    }

}
