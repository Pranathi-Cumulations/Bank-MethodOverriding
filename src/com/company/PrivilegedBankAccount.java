package com.company;

public class PrivilegedBankAccount extends UsualBankAccount {

    PrivilegedBankAccount(String name,long phoneNumber,int InitialDeposit){
        super(name,phoneNumber,0);
    }

    //allows the user to debit the amount greater than his/her balance

    @Override
    public void debit(int amount) {
        this.balance-=amount;
        System.out.println("Balance after debit :" + this.balance);
    }

    //considering the situation where bank is ready to give loan
     public void eligibleLoanValue(int assetValue){

        System.out.println(0.7*assetValue);
     }

}

