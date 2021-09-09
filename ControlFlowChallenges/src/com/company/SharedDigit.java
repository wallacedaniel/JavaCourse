package com.company;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        //System.out.println(hasSharedDigit(19, 99));
        //System.out.println(hasSharedDigit(15, 55));
    }

    // return true if a digit appears in both numbers
    public static boolean hasSharedDigit(int number1, int number2){

        if (number1 <= 10 || number1 > 99 || number2 <= 10 || number2 > 99 ) {
            return false;
        }

        int number1Length = String.valueOf(number1).length();
        int number2Length = String.valueOf(number2).length();

        int outerDigitPointer = 10;

        for (int i = 0; i < number1Length; i++) {

            int innerDigitPointer = 10;
            for (int j = 0; j < number2Length; j++){
                if ((number1 % outerDigitPointer) / (outerDigitPointer/10) == (number2 % innerDigitPointer)  / (innerDigitPointer/10)) {
                    return true;
                }
                innerDigitPointer *= 10;
            }
            outerDigitPointer *= 10;
        }
        return false;
    }
}
