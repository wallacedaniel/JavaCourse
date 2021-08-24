package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 3;
        System.out.println(result);
        result -= 3;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not an alien");
        }

        int score1 = 5;
        int score2 = 10;

        if (score2 != 10) {
            System.out.println("this does not print");
        }

        // > < >= <=  !

        // && ||

        boolean isCar = false;
        // ternary
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("that was a car");
        }

        double myDouble  = 20.00d;
        double mySecondDouble = 80.00d;
        double total = (myDouble + mySecondDouble) * 100.00d;
        double remainder = total % 40.00d;

        boolean noRemainder = remainder == 0 ? true : false;
        System.out.println(noRemainder);

        if(!noRemainder){
            System.out.println("Got some remainder");
        }
    }
}
