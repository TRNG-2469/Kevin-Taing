package com.rev.oops;

public class CheckingAccount extends BankAccount {
    private double overdraft;

    public CheckingAccount() {}

    public CheckingAccount(String accountNumber, String accountName, double balance, double overdraft) {
        super(accountNumber, accountName, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return getBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
            return getBalance();
        }
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraft) {
            setBalance(getBalance() - amount);
            return getBalance();
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance plus overdraft.");
            return getBalance();
        }
    }
}
