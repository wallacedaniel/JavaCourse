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

            boolean customerAdded = branch.newCustomer(customerName, initialTransaction);
            return customerAdded;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

        Branch branch = findBranch(branchName);

        if(branch != null) {

            boolean transactionAccepted = branch.addCustomerTransaction(customerName, transaction);
            return transactionAccepted;
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
                int customerIndex = i + 1;
                System.out.println("Customer: " + customer.getName() + "[" + customerIndex + "]");

                if(printTransactions) {
                    System.out.println("Transactions");

                    ArrayList<Double> transactions = customer.getTransactions();

                    for (int j = 0; j < transactions.size(); j++) {
                        int transactionIndex = j + 1;
                        System.out.println("[" + transactionIndex + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}



