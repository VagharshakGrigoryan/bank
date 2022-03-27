package com.company.mod1.test;

import com.company.mod1.domein.*;

import java.util.Objects;

public class TestAccount {
    public static void main(String[] args) {


        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);


        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Objects.requireNonNull(Bank.getCustomer(0)).getAccount(0).deposit(2000);
        Objects.requireNonNull(Bank.getCustomer(0)).getAccount(1).withDraw(5500);
        ((SavingsAccount) Objects.requireNonNull(Bank.getCustomer(0)).getAccount(0)).addInterestRate();


        System.out.println(Bank.getCustomer(0));
        System.out.println((Bank.getCustomer(1)));


    }
}
