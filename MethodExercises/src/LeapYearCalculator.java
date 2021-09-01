public class LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(-12));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1800));
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
