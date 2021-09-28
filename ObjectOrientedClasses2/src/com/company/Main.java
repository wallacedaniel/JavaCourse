package com.company;

import java.beans.EventHandler;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // autoboxing and unboxing
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Whats up");

        //ArrayList<int> intArrayList = new ArrayList<int>(); // invalid - prim vs class
        //ArrayList<IntClass> intArrayList = new ArrayList<IntClass>(); // could create wrapper class
        //intArrayList.add(new IntClass(55));  // instead use java built in wrapper classes
        Integer integer = new Integer(55);
        Double doubleValue = new Double(55.00);

        //boxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        //unboxing
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // simpler boxing   Integer.valueOf(56)
        int myInt = myIntValue.intValue();

        //simpler example w doubles
        ArrayList<Double> dblArrayList = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl++){
            dblArrayList.add(dbl);
        }

        //unboxing
        for(int i = 0; i < dblArrayList.size(); i++){
            System.out.println(i + " --> " + dblArrayList.get(i));
        }


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
