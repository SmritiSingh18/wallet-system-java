package com.project1.wallet;

public class BankAccount {

    private long accountNumber;
    private double accountBalance;

    public BankAccount(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        accountBalance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }

        if (amount > accountBalance) {
            throw new RuntimeException("Insufficient balance");
        }

        accountBalance -= amount;
    }
}
