package bankingApp;

import bankingApp.BankAccount;

public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount){
        if(amount <= maxDepositAmount ){
            setBalance(getBalance() + amount);
        }
    }


}
