package com.company;

public class Main {

    public static void main(String[] args) {
	    PrivilegedBankAccount bankAccount=
                new PrivilegedBankAccount("Pranathi",123456,0);
        bankAccount.credit(1000);
        
         bankAccount.debit(1500);

        bankAccount.eligibleLoanValue(50000);

    }
}
