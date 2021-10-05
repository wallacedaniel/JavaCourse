package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        //initialize branches
    }

    public boolean addBranch(String branchName){

        return false;
    }

    public boolean addCustomer( String branchName, String customerName, double initialTransaction){

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

        return false;
    }

    private Branch findBranch(String branchName){

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){

        return false;
    }
}


//        returns true if the branch was added successfully or false otherwise.
//
//        addCustomer()  ,returns a boolean. It returns true if the customer was added successfully or false otherwise.
//
//        addCustomerTransaction() returns true if the customers transaction was added successfully or false otherwise.
//
//        findBranch() Return the Branch if it exists or null otherwise.
//
//        listCustomers()  returns a boolean. Return true if the branch exists or false otherwise.
//                This method prints out a list of customers.
//
//


//  TIP:  In Bank, use the findBranch() method in each of the other four methods to validate a branch. Do the same thing in Branch with findCustomer()
//          - except for the two getters.
//  TIP:  In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
//TIP:  Think about what methods you need to call from another class when implementing a method.


