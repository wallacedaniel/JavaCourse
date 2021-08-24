package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        // preferred format
        float myFloatValue = 5f / 3f;
        // double preferred .. assumed default
        double myDoubleValue = 5d / 3d;
        System.out.println("int value = " + myIntValue);
        System.out.println("float value = " + myFloatValue);
        System.out.println("double value = " + myDoubleValue);

        // convert pounds to kilograms  1 lb = 0.45359237
        double poundsToConvert = 12d;
        double kilograms = poundsToConvert / 0.45359237d;
        System.out.println(kilograms);
    }
}
