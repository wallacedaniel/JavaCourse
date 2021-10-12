package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// nested class types - static - non static(inner class) - local (inner class defined in scope block ex: method) - anonymous

	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


    	// abstract class similar to interface .. can't instantiate  .. provide common definition of a base class that multiple derived classes can share
			// can have member variables that are inherited  .. interface are all public static final ..
			// can extend one class ... but implement multiple interfaces
			// can have constructors
			// interface all members are public where a/c can be any visibility
			// a/c can have defined methods ... methods w an implementation .. where interface do not
			// when subclassed .. subclass usually implements parent ab methods .. or sub must be abstract too
			// interface .. points of variation
				// common use for otherwise unrelated classes
				// interface can extend another interface


    	Dog dog = new Dog("Doberman");
    	dog.breathe();
    	dog.eat();

    	Parrot parrot = new Parrot("Macaw");
    	parrot.breathe();
    	parrot.eat();
    	parrot.fly();

    	Penguin penguin = new Penguin("Emperor");
    	penguin.fly();

		//local (inner class defined in scope block
//    	class ClickListener implements Button.OnClickListener {
//
//    		public ClickListener() {
//				System.out.println("I've been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}
//
//		btnPrint.setOnClickListener(new ClickListener());


		//anonymous inner class
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});

		listen();


		// non static(inner class)  .. when doesn't make sense to refer to class w/out outer class

		Gearbox mcLaren = new Gearbox(6);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));


	    ITelephone myPhone;
	    myPhone = new DeskPhone(1234567);
	    myPhone.powerOn();
	    myPhone.callPhone(1234567);
	    myPhone.answer();

		myPhone = new MobilePhone(7654321);
		myPhone.powerOn();
		myPhone.callPhone(7654321);
		myPhone.answer();

		Player daniel = new Player("Daniel", 50, 100);
		System.out.println(daniel.toString());
		saveObject(daniel);

		ISaveable werewolf = new Monster("Werewolf", 10, 20);
		System.out.println("Strength = " + ((Monster) werewolf).getStrength());
		saveObject(werewolf);
		// if possible.. preferable to
//		Monster werewolf = new Monster("Werewolf", 10, 20);
//		System.out.println("Strength = " + werewolf.getStrength();

		daniel.setHitPoints(45);
		System.out.println(daniel);
		daniel.setWeapon("Wand");
		saveObject(daniel);
		loadObject(daniel);
		System.out.println(daniel);
    }

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" +
				"1 to enter a string\n" +
				"0 to quit");

		while (!quit) {
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.print("Enter a string: ");
					String stringInput = scanner.nextLine();
					values.add(index, stringInput);
					index++;
					break;
			}
		}
		return values;
	}

	public static void saveObject(ISaveable objectToSave) {
    	for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to the storage device");
		}
	}

	public static void loadObject(ISaveable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

	private static void listen() {
    	boolean quit = false;
    	while(!quit) {
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					btnPrint.onClick();
			}
		}
	}
}
