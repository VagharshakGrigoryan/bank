package com.company.mod1.domein;

public class CheckingAccount extends Account {

    private final double overdraftAmounth;

    public CheckingAccount(double initBlane, double overdraftAmounth) {
        this.balance = initBlane;
        this.overdraftAmounth = overdraftAmounth;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    @Override
    public boolean withDraw(double amt) {
        if (amt <= this.balance + overdraftAmounth) {
            balance = balance - amt;
            return true;
        }
        return false;
    }

    public double getOverdraftAmounth() {
        return overdraftAmounth;
    }
}
