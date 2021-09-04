package com.company;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 0;
        }

        int lastDigit = number % 10;

        // length of digit and temp provides place value
        int length = 0;
        int temp = 1;

        while (temp <= number) {
            length++;
            temp *= 10;
        }

        int firstDigit = number/(temp/10);

        return firstDigit + lastDigit;
    }
}
