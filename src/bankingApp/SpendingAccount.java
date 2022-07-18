package bankingApp;

import bankingApp.BankAccount;

public class SpendingAccount extends BankAccount {
    private double maxWithdrawlAmount;

    public SpendingAccount(double balance, String accountNumber, double maxWithdrawlAmount) {
        super(balance, accountNumber);
        this.maxWithdrawlAmount = maxWithdrawlAmount;
    }

    public double getMaxWithdrawlAmount() {
        return maxWithdrawlAmount;
    }

    public void setMaxWithdrawlAmount(double maxWithdrawlAmount) {
        this.maxWithdrawlAmount = maxWithdrawlAmount;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + maxWithdrawlAmount) {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

}
