package com.company.mod1.domein;

public class Bank {
    private final Customer[] customer = new Customer[1000];
    private int numOfClients = 0;
    private static final Bank myBank = new Bank();

    private Bank() {
    }


    public Customer getCustomer(int customerNumber) {
        if (customerNumber < customer.length) {
            return customer[customerNumber];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customer[numOfClients] = newCustomer;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public static Bank getBank() {
        return new Bank();
    }
}
