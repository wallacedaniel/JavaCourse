package com.company;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number){

        if(number <= 1) {
            return -1;
        }

        for (int i = number; i > 1; i--){

            if (number % i == 0){

                boolean isPrime = true;
                for (int j = i - 1; j > 1; j--){
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    return i;
                }

            }
        }
        System.out.println();
        return -1;
    }
}


