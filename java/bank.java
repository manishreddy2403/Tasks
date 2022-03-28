package com.banking;
import java.util.*;

public class bank {
    public bank() {
    }

    void createAccount(String name, int currentAccountNo, HashMap<Integer, Account> account) {
        account.put(currentAccountNo, new Account(name, 0));
    }

    void deposit(int accountNo, int amount, HashMap<Integer, Account> account) {
        if (!account.containsKey(accountNo)) {
            System.out.println("no account with account number " + accountNo + " present");
        } else if (amount < 500) {
            System.out.println("Minimum deposit amount is 500");
        } else if (amount > 50000) {
            System.out.println("Maximum deposit amount is 50000");
        } else if (((Account)account.get(accountNo)).balance + amount > 100000) {
            System.out.println("Account balance cannot exceed ₹1,00,000");
        } else if (((Account)account.get(accountNo)).depositCount >= 3) {
            System.out.println("Only 3 deposits are allowed in a day");
        } else {
            Account newAccDetails = (Account)account.get(accountNo);
            ++newAccDetails.depositCount;
            newAccDetails.balance = newAccDetails.balance + amount;
            account.put(accountNo, newAccDetails);
            System.out.println(newAccDetails.balance);
        }
    }

    void withdraw(int accountNo, int amount, HashMap<Integer, Account> account) {
        if (!account.containsKey(accountNo)) {
            System.out.println("no account with account number " + accountNo + " present");
        } else if (amount < 1000) {
            System.out.println("Minimum withdraw amount is 1000");
        } else if (amount > 25000) {
            System.out.println("Maximum withdraw amount is 25000");
        } else if (((Account)account.get(accountNo)).balance - amount < 0) {
            System.out.println(": Insufficient balance");
        } else if (((Account)account.get(accountNo)).depositCount >= 3) {
            System.out.println("Only 3 withdrawals are allowed in a day");
        } else {
            Account newAccDetails = (Account)account.get(accountNo);
            ++newAccDetails.depositCount;
            newAccDetails.balance = newAccDetails.balance - amount;
            account.put(accountNo, newAccDetails);
            System.out.println(newAccDetails.balance);
        }
    }

    void balance(int accountNo, HashMap<Integer, Account> account) {
        System.out.println(((Account)account.get(accountNo)).balance);
    }

    void transfer(int giveAccountNo, int receiveAccountNo, int amount, HashMap<Integer, Account> account) {
        for(int i:account.keySet()){
            if(i==giveAccountNo) {
                Account a = account.get(i);
                a.balance = a.balance - amount;
            }
            if(i==receiveAccountNo) {
                Account a = account.get(i);
                a.balance = a.balance + amount;
            }

        }
        System.out.println("Success..");
    }
}


