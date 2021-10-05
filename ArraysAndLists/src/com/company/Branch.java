package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        // instantiate customers
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        return false;
    }

    private Customer findCustomer(String customerNam) {
        return null;
    }
}

//  newCustomer() returns a boolean. Returns true if the customer was added successfully or false otherwise.
//
//  addCustomerTransaction() returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
//
//  findCustomer() Return the Customer if they exist, null otherwise.

