package com.company;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }


    // return true if at least 2 numbers share the same right most digit
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if ( !isValid(number1) || !isValid(number2) || !isValid(number2)) {
            return false;
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        if ( lastDigit1 == lastDigit2|| lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
            return true;
        }
        return false;

    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
