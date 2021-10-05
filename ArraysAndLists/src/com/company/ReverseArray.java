package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arrayToReverse = {1,2,3};
        reverse(arrayToReverse);
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        String displayString = "Array = [";
        for (int i = 0; i < array.length; i++){
            if(i != array.length -1) {
                displayString += String.valueOf(array[i]) + ", ";
            } else {
                displayString += String.valueOf(array[i]) + "]";
            }
        }
        System.out.println(displayString);

        for(int i=0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        displayString = "Reversed array = [";
        for (int i = 0; i < array.length; i++){
            if(i != array.length -1) {
                displayString += String.valueOf(array[i]) + ", ";
            } else {
                displayString += String.valueOf(array[i]) + "]";
            }
        }
        System.out.println(displayString);
    }
}

//        The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
//
//        and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
//

