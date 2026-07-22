package com.rev.oops;

public class SavingAccount extends BankAccount implements Taxable{
    private double interestRate;

    public SavingAccount() {}

    public SavingAccount(String accountNumber, String accountName, double balance, double interestRate) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return getBalance();
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
            return getBalance();
        }
    }


    @Override
    public double getTaxAmount() {
        return 0;
    }
}
