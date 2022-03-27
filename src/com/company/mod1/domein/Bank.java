package com.company.mod1.domein;

public class Bank {
    private static final Customer[] customer =  new Customer[1000];
    private static int numOfClients =0;

    private Bank() {

    }

    public static Customer getCustomer(int customerNumber) {
        if (customerNumber < customer.length) {
            return customer[customerNumber];
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customer[numOfClients] = newCustomer;
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
