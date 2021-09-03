package com.company;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());


        Account myAccount = new Account();
        Account myAccount2 = new Account("12345", 99.99, "Billy Joe", "billy@joe.com", "5551234567");
        Account myAccount3 = new Account("Bobby Sue", "bobby@sue.com", "5551234567");
        myAccount.setBalance(0.00);
        myAccount.withdrawal(1000.00);
        myAccount.deposit(500.00);
        myAccount.withdrawal(1000.00);
        myAccount.deposit(501.00);
        myAccount.withdrawal(1000.00);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Jack", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Jill", 100.00, "jill@email.com");
        System.out.println(person3.getName());

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
