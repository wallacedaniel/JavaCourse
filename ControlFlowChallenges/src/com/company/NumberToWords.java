package com.company;

public class NumberToWords {
    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number){
        return -1;
    }

    public static int getDigitCount(int number){
        return -1;
    }
}

