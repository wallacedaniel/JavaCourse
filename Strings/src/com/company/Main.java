package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("my string is ...");
        myString = myString + "...and this is more string";
        System.out.println(myString);
        myString = myString + " \u00A9 2021";
        System.out.println(myString);


        String numberString = "250.55";
        numberString = numberString + "125.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        //appends as text
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
