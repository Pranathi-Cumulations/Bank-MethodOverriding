package com.company;

public class UsualBankAccount {
    public String userName;
    public long contactNumber;
    public int balance;

    UsualBankAccount(String name,long phoneNumber,int initialDeposit){
        this.userName = name;
        this.contactNumber = phoneNumber;
        this.balance = initialDeposit;
    }

    public void credit(int amount){
        this.balance+=amount;
        System.out.println("Balance after credit : "+ this.balance);
    }

    public void debit(int amount) {
        if(this.balance>amount) {
            this.balance -= amount;
            System.out.println("Balance after debit : " + this.balance);
        }
    }
}

