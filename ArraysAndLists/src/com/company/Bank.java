package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){

        Branch branch = findBranch(branchName);

        if(branch == null) {
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer( String branchName, String customerName, double initialTransaction){

        Branch branch = findBranch(branchName);

        if(branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {

                Customer customer = customers.get(i);

                if (customer.getName().equals(customerName)) {
                    branch.newCustomer(customerName, initialTransaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

        Branch branch = findBranch(branchName);

        if(branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {

                Customer customer = customers.get(i);

                if (customer.getName().equals(customerName)) {
                    customer.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }



    private Branch findBranch(String branchName){

        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){

        Branch branch = findBranch(branchName);

        if(branch != null) {

            System.out.println("Customer details for branch " + branchName);

            ArrayList<Customer> customers = branch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {

                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + i+1 + "]");

                if(printTransactions) {
                    System.out.println("Transactions");

                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + i+1 + "]  Amount " + transactions.get(i));
                    }
                }
            }
            return true;
        }
        return false;
    }
}



