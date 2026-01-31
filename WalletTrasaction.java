package com.project1.wallet;

public class WalletTrasaction implements Runnable{

    private BankAccount account;
    private double amount;

    public WalletTrasaction(BankAccount account,double amount){
        this.account=account;
        this.amount=amount;
    }
   
    @Override
    public void run() {
        try { 
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    ", remaining balance: " + account.getBalance());
            
        } catch (InsufficientException |InvalidAmount e) {
             System.out.println(Thread.currentThread().getName() +
                    " failed: " + e.getMessage());
           
        }
        
    }
}

