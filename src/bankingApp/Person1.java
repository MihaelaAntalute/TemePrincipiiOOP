package bankingApp;

import bankingApp.BankAccount;
import bankingApp.StudentAccount;

import java.util.Arrays;

public class Person1 {
    private String firstName;
    private String lastName;
    private BankAccount[] accountList;
    private int numberOfAccounts;

    public Person1(String firstName, String lastName, BankAccount[] accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList(BankAccount[] accountList) {
        this.accountList = accountList;
    }

    public void addAccount(BankAccount account) {
        accountList[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    public void listAccounts() {
        for (int i = 0; i < accountList.length; i++) {
            System.out.println("Numarul contului: " + accountList[i].getAccountNumber() + " soldul contului: " + accountList[i].getBalance());
            if (accountList[i] instanceof StudentAccount) {
                System.out.println("Tipul contului este: bankingApp.StudentAccount");
            } else {
                System.out.println("Tipul contului este: bankingApp.SpendingAccount");
            }
        }
    }


    public void deposit(double amount, String accountNumber) {
        //1. gasim contul in care depunem
        //2. depunem
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                accountList[i].deposit(amount);
            }
        }
    }
    public void withdraw(double amount, String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);
        accountList[withdrawalAccountPosition].withdraw(amount);
    }

    private int search(String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
              return i;
            }
        }
        return -1;
    }

    public void checkAccountDetails(){
        System.out.println(this.getFirstName()+" " + this.getLastName() + accountList);
    }
    //va printa toate detaliile unui anumit cont
}

