package com.company;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(12321));
//        System.out.println(isPalindrome(123211));
    }

    public static boolean isPalindrome(int number){

        number = Math.abs(number);
        int numberStart = number;
        int reverse = 0;

        while(number > 0) {
            int lastDigit = number % 10;
            System.out.println("lastDigit is " + lastDigit);
            reverse = reverse * 10;
            System.out.println("reverse * 10 is " + reverse);
            reverse += lastDigit;
            System.out.println("reverse + lastDigit is " + reverse);
            number /= 10;
            System.out.println("number / 10 is " + number);
        }
        if (numberStart == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
