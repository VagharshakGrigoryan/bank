package com.company.mod1.domein;

/**
 * Bank Account class
 *
 * @author Admin
 */
public abstract class Account {
    protected double balance;

    /**
     * constructor that provides initial balance
     * @param balance a positive account balance
     */
    protected Account(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    public Account() {
        this.balance=0;
    }

    /**
     * Method to add money account
     * @param amt a positive amount of money
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    /**
     * Method to withdraw money
     * @param amt a positive amount of money
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }

    /**
     * Method to check balance account
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    public abstract boolean withDraw(double amt);
}
