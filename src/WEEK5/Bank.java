package WEEK5;

import java.util.ArrayList;

public class Bank {
    // 1. variable
    private ArrayList<BankAccount> accounts;

    // 2. constructor
    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    // 3. methods
    // add an account to this bank
    public void addAccount(BankAccount a) {
        accounts.add(a);
    }

    // gets the sum of the balances of all accounts in this bank
    public double getTotalBalance() {
        double totalBalance = 0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    // counts the number of bank account whose balance is at least given value.
    public int countBalanceAtLeast(double atLeast) {
        int count = 0;
        for (BankAccount account : accounts) {
            if (account.getBalance() >= atLeast) {
                count++;
            }
        }
        return count;
    }

    // finds a bank account with a given number
    public BankAccount find(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // gets the bank account with the largest balance.
    public BankAccount getMax() {
        if (accounts.isEmpty()) {
            return null;
        }

        BankAccount maxAccount = accounts.get(0);
        for (BankAccount account : accounts) {
            if (account.getBalance() > maxAccount.getBalance()) {
                maxAccount = account;
            }
        }
        return maxAccount;
    }

    // gets the bank account with the minimum balance.
    public BankAccount getMin() {
        if (accounts.isEmpty()) {
            return null;
        }

        BankAccount minAccount = accounts.get(0);
        for (BankAccount account : accounts) {
            if (account.getBalance() < minAccount.getBalance()) {
                minAccount = account;
            }
        }
        return minAccount;
    }
}