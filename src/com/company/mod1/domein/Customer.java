package com.company.mod1.domein;

public class Customer {

    private final Account[] account;
    private final String fullName;
    private final int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String fullName) {
        account = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < account.length && numOfAccounts != 0) {
            return account[accNo];
        }
        return null;
    }

    public void addAccount(Account acc) {
        account[numOfAccounts] = acc;
        numOfAccounts++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Customer{" +
                "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts);

        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount)
                s.append("\n\t").append(i).append("Savings account with interest rate %").append(((SavingsAccount) acc).getInterestRate());
            else
                s.append("\n\t").append(i).append("Checking account with overdraft $").append(((CheckingAccount) acc).getOverdraftAmounth());
                   s.append(", balance $ ").append(acc.getBalance());
        }
        System.out.println(" ");

        return s.toString();
    }
}
