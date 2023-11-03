package bankAccount;

public class CurrentAccount extends BankAccount {
    private String tradeLicenseNumber;

    // constructor
    public CurrentAccount(String memberName, double accountBalance, String tradeLicenseNumber) {
        super(memberName, accountBalance, 5000);
        this.tradeLicenseNumber = tradeLicenseNumber;
    }

    // get trade license number
    public String getTradeLicenseNumber() {
        return this.tradeLicenseNumber;
    }

    // set trade license number
    public void setTradeLicenseNumber(String tradeLicenseNumber) {
        this.tradeLicenseNumber = tradeLicenseNumber;
    }
}
