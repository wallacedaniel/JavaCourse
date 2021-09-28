package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        boolean editing = true;
        int count = 0;
        int sum = 0;
        long avg = 0;

        while (true) {

            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int inputNumber = scanner.nextInt();
                count++;
                sum += inputNumber;
                avg = sum / count;

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}

