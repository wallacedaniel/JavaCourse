package com.company;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }


    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        switch(month) {
            case 1: case 3: case 5: case 7:  case 8:  case 10:  case 12:
                return 31;
            case 4:  case 6:  case 9:  case 11:
                return 30;
            case 2:
                if(isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                System.out.println("Invalid Month");
                break;
        }
        return -1;
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
