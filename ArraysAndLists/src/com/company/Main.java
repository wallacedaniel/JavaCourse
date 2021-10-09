package com.company;



import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9713225162");
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);


        System.out.println("*********************************");

    Bank bank = new Bank("National Australia Bank");
    bank.addBranch("Adelaide");

    bank.addCustomer("Adelaide", "Tim", 50.05);
    bank.addCustomer("Adelaide", "Mike", 175.34);
    bank.addCustomer("Adelaide", "Percy", 220.12);

    bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
    bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
    bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

    bank.listCustomers("Adelaide", true);
    bank.listCustomers("Adelaide", false);


        boolean editingContacts = true;
        int choice = 0;
        displayOptions();

        while(editingContacts) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    displayOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    //removeContact();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    processContactList();
                    break;
                case 7:
                    editingContacts = false;
                    break;
            }
        }










        boolean quit = false;
        choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }



        int[] array = {1, 3, 5, 7, 9, 11 ,13};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

        System.out.println("Enter count:");
        int count = scanner.nextInt();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

        int[] myIntArray = new int[25]; // {1,2,3,4,5,6,7,8,9,10};
        //myIntArray[0] = 45;

        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        for(int i=0; i < myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));


        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray2 = new int[5];
        int[] anotherArray = myIntArray2;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray2));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray2));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray2));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));


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

        Integer myIntValue2 = 56; // simpler boxing   Integer.valueOf(56)
        int myInt = myIntValue2.intValue();

        //simpler example w doubles
        ArrayList<Double> dblArrayList = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl++){
            dblArrayList.add(dbl);
        }

        //unboxing
        for(int i = 0; i < dblArrayList.size(); i++){
            System.out.println(i + " --> " + dblArrayList.get(i));
        }
    }

    public static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("At the beginning of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("At the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("At the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previous song\n" +
            "3 - to replay the current song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print available actions\n" +
            "6 - delete current song from the playlist\n"
        );
    }

    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================");
    }



    public static void displayOptions() {
        System.out.println("\nPress ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To display all contacts.");
        System.out.println("\n 2 - To add a new contact.");
        System.out.println("\n 3 - To update an existing contact.");
        System.out.println("\n 4 - To remove a contact.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To quit the editing contacts.");
    }

    public static void addContact() {
        System.out.println("Enter the contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter the contact phone number: ");
        String contactNumber = scanner.nextLine();
        //mobilePhone.addContact(contactName, contactNumber);
    }

    public static void modifyContact() {
        System.out.println("Enter contact name to edit: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newContactNumber = scanner.nextLine();
        //mobilePhone.modifyContactList(contactName, newContactName, newContactNumber);
    }

//    public static void removeContact() {
//        System.out.println("Enter contact name to remove: ");
//        String contactName = scanner.nextLine();
//        mobilePhone.removeContact(contactName);
//    }

    public static void searchContacts() {
        System.out.println("Enter contact to search: ");
        String searchItem = scanner.nextLine();
//        if(mobilePhone.onFile(searchItem)) {
//            System.out.println("Found " + searchItem + " in the contact list");
//        } else {
//            System.out.println(searchItem + " is not in the contact list");
//        }
    }

    public static void processContactList() {
        ArrayList<Contact> newArray = new ArrayList<Contact>();
        newArray.addAll(mobilePhone.getContactList());

        ArrayList<Contact> nextArray = new ArrayList<Contact>(mobilePhone.getContactList());

        Contact[] myArray = new Contact [mobilePhone.getContactList().size()];
        myArray = mobilePhone.getContactList().toArray(myArray);
    }












    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item in the list.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item in the list.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery items: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in the grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String [groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }






    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        for(int i=0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i=0; i < array.length; i++){
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i < array.length; i++){
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }

    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {

        int sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];
        for(int i=0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for(int i=0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
