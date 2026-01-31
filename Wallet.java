package com.project1.wallet;

public class Wallet {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, 1000);

        Thread user1 = new Thread(new WalletTrasaction(account, 700), "User-1");
        Thread user2 = new Thread(new WalletTrasaction(account, 700), "User-2");

        user1.start();
        user2.start();
    }
}
    