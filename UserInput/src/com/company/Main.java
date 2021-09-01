package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handles next line character (enter key) after entering number

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }


        int counter = 0;
        int sum = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("sum = " + sum);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){

                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
                scanner.nextLine();
        }

        System.out.println("Minimum was = " + min + " and Maximum was = " + max);
        scanner.close();
    }
}
