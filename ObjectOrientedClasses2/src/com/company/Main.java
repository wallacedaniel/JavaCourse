package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());



//        Basic hamburger on a White roll with Sausage, price is 3.56
//        Added Tomato for an extra 0.27
//        Added Lettuce for an extra 0.75
//        Added Cheese for an extra 1.13
//        Total Burger price is 5.71
//        Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
//        Added Egg for an extra 5.43
//        Added Lentils for an extra 3.41
//        Total Healthy Burger price is  14.51
//        Cannot not add additional items to a deluxe burger
//        Deluxe hamburger on a White roll with Sausage &amp; Bacon, price is 14.54
//        Added Chips for an extra 2.75
//        Added Drink for an extra 1.81
//        Total Deluxe Burger price is 19.10


//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.5, "White");
//        double price = hamburger.itemizeHamburger();
//        hamburger.addHamburgerAddition1("Cheese", 0.75);
//        hamburger.addHamburgerAddition2("Tomato", 0.5);
//        hamburger.addHamburgerAddition3("Pickles", 0.25);
//        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.5);
//        healthyBurger.addHamburgerAddition1("Egg", 2.00);
//        healthyBurger.addHealthyAddition1("Fruit", 2.00);
//        System.out.println("Total Price is " + healthyBurger.itemizeHamburger());
//
//        DeluxeBurger db = new DeluxeBurger();
//        db.itemizeHamburger();

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.startEngine());

        Ford ford = new Ford(6, "Outlander VRX 4WD");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());

        Holden holden = new Holden(6, "Outlander VRX 4WD");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.startEngine());


        Printer printer = new Printer(50, true);
        System.out.println(("initial page count = " + printer.getPagesPrinted()));
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        System.out.println("*************");


        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3,2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("My Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();


        System.out.println("*************");


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        System.out.println("*************");

//        Player player = new Player() ;
//        player.fullName = "Daniel";
//        player .health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Daniel", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        System.out.println("*************");


    }
}
