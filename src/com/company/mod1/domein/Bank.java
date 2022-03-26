package com.company.mod1.domein;

public class Bank {
    private final Customer[] customer;
    private int numOfClients;

    public Bank() {
        customer = new Customer[1000];
        numOfClients = 0;
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
}
