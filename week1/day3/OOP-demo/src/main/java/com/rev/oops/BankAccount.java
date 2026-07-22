package com.rev.oops;

public abstract class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    // DMAT Account
    // Credit Card Account

    public BankAccount() {}

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);
}
