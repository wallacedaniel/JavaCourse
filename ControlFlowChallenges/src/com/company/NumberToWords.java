package com.company;

public class NumberToWords {
    public static void main(String[] args) {

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

//        System.out.println("***********");
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//
//        System.out.println("***********");

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        int digitLength = getDigitCount(number);
        int counter = digitLength;



        while(counter > 0) {

            // record last digit w % 10 > pull off the last number by /= 10

            int lastDigit = reverseNumber % 10;
            reverseNumber /= 10;

            switch(lastDigit) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                case 0:
                    System.out.print("Zero");
                    break;
                default:
                    System.out.print("OTHER");
                    break;
            }
            if(counter != 1){
                System.out.print(" ");
            }
            counter--;
        }
        System.out.println();
    }

    public static int reverse(int number){

        int reversedNumber = 0;

        boolean isNegative = false;
        if(number < 0) {
            isNegative = true;
        }



        while(number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
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

//    Write a method called numberToWords with one int parameter named number.
//
//        The method should print out the passed number using words for the digits.
//
//        If the number is negative, print "Invalid Value".
//
//        To print the number as words, follow these steps:
//
//        1. Extract the last digit of the given number using the remainder operator.
//        2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//        3. Remove the last digit from the number.
//        4. Repeat Steps 2 through 4 until the number is 0.
//
//
//
//
//
//
//
//        The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//
//        The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//
//        Use the method reverse within the method numberToWords in order to print the words in the correct order.
//
//        Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//
//
//


//        HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
//
//
//        NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
//        One
//        Two
//        Three
//        They don't have to be separated by a space.



