package com.company;

public class NumberToWords {
    public static void main(String[] args) {

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
//
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number){

        int reversedNumber = 0;

        boolean isNegative = false;
        if(number < 0) {
            isNegative = true;
        }

        int digitLength = getDigitCount(number);

        int sumPointer = 1;
        while(number > 0) {

            int lastDigit = number % 10;
            reversedNumber = reversedNumber + (lastDigit * sumPointer);
            number /= 10;
            sumPointer *= 10;
        }

       if (isNegative == true){
            reversedNumber = reversedNumber * -1;
        }

       return reversedNumber;
    }


    public static int getDigitCount(int number){

        if(number < 0) {
            return -1;
        }

        int digits = 0;
        int pointer = 1;

        while (pointer <= number) {
            digits++;
            pointer *= 10;
        }

        if(number == 0) { digits = 1; }

        return digits;
    }
}

