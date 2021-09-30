package com.company;

import java.util.Scanner;

public class SortedArray {


    public static void main(String[] args) {

        int[] unsortedArray = getIntegers(5);
        int[] sorted = sortIntegers(unsortedArray);
        printArray(sorted);
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

    public static int[] getIntegers(int number) {

        //System.out.println("Enter " + number + " integer values.\r");
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];

        for(int i=0; i < number; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}
