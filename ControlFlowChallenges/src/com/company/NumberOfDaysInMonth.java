package com.company;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

    }


    public static boolean getDaysInMonth(int month, int year){
        return true;
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0) {
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        } else {
            System.out.println("year is invalid");
        }
        return false;
    }
}
