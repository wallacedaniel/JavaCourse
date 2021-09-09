package com.company;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    // perfect number is positive integer = to sum of proper positive divisors
    // positive integers that fully divide the perfect number w/out leaving a remainder and exclude the perfect number

    public static boolean isPerfectNumber(int number){

        if(number < 1){
            return false;
        }

        int sum = 0;
        for(int i = 1; i <= number/2; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }

        if(sum == number) {
            return true;
        }
        return false;
    }
}
