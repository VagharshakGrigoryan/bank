package com.company.mod1.domein;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        this.balance = initBalance;
        this.interestRate = interestRate;
    }

    @Override
    public boolean withDraw(double amt) {
        return false;
    }

    public void addInterestRate() {
        this.balance = this.balance + this.balance * interestRate / 100;
    }

}
