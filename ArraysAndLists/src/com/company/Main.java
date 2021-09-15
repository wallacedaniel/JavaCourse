package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
