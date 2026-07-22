package com.rev.oops;

public class AccountManager {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("123456", "John Doe", 1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("654321", "Jane Smith", 500.0, 200.0);
    }
}
