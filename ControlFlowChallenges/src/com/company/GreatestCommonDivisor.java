package com.company;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommonDivisor = 1;
        int counterValue = 0;

        //first <= second ? lesserValue = first : lesserValue = second;  // error ** variable expected?
        if (first <= second) {
            counterValue = first;
        } else {
            counterValue = second;
        }

        while(counterValue >= 2){
            if (first % counterValue == 0 && second % counterValue == 0) {
                greatestCommonDivisor = counterValue;
                break;
            }
            counterValue--;
        }
        return greatestCommonDivisor;
    }
}
