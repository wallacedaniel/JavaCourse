package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
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
