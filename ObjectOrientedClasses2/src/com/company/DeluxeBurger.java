package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 8.00, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add items to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add items to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add items to the Deluxe Burger");
    }
}
