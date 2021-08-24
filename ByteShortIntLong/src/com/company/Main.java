package com.company;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        // casting
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

        byte testByte = 10;
        short testShort = 20;
        int testInt = 50;

        long testLong = 50000L + 10L * (testByte + testShort + testInt);
        short shortTotal = (short) (1000 + 10 * (testByte + testShort + testInt));
        System.out.println(testLong);
        System.out.println(shortTotal);
    }
}
