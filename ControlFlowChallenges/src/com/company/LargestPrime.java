package com.company;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number){

        if(number <= 1) {
            return -1;
        }

        for (int i = number; i > 0; i--){

            if (number % i == 0){



                System.out.println( i + " is a factor");

                int j = 2;
                boolean isPrime = false;
                while (j <= i / 2) {
                    // condition for nonprime number
                    if (i % j == 0) {
                        isPrime = true;
                        System.out.println( j + " is a prime");
                        //break;
                    }

                    ++j;
                }

//                for (int j = i; j >= 3; j--) {
//
//                    if (num % i == 0) {
//                        flag = true;
//                        break;
//                    }
//
//                }



//                for (int j = i; j > 2; j--) {
//                    if (i % j == 0) {
//                        return j;
//                    }
//                }
//                return i;
            }
        }
        return -1;
    }
}
