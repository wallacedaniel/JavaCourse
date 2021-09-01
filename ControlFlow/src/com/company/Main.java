package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 4 or 5");
                break;
            default:
                System.out.println("Value not any of the provided values");
                break;
        }

        char switchValue2 = 'A';

        switch(switchValue2) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was C D or E");
                break;
            default:
                System.out.println("Value not any of the provided values");
                break;
        }

        char dayOfTheWeek = 3;

        switch(dayOfTheWeek) {
            case 0:
                System.out.println("Today is Monday");
                break;
            case 1:
                System.out.println("Today is Tuesday");
                break;
            case 2:
                System.out.println("Today is Wednesday");
                break;
            case 3:
                System.out.println("Today is Thursday");
                break;
            case 4:
                System.out.println("Today is Friday");
                break;
            case 5:
                System.out.println("Today is Saturday");
                break;
            case 6:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

        for (int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


        int count2 = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count2++;
                sum += i;
                System.out.println("Found a number = " + i);
            }
            if (count2 == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number" + number);

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);


        String numberAsString = "2021";
        String doubleAsString = "2021.50";
        System.out.println("numberAsString = " + numberAsString);

        int number2 = Integer.parseInt(numberAsString);
        System.out.println("number2 = " + number2);
        double number3 = Double.parseDouble(doubleAsString);
        System.out.println("doubleAsString = " + doubleAsString);
        // float and long etc as well

        numberAsString += 1;
        number2 += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number2 = " + number2);

        System.out.println("Sum of digits 12345 = " + sumDigits(12345));

        
    }

    public static int sumDigits(int number){

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0){

            int digit = number % 10;
            sum += digit;

            number /= 10;
        }

        return sum;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }

    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int n){

        // optimized ..rather than n/2...(long) Math.sqrt(n)
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
