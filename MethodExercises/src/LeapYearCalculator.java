public class LeapYearCalculator {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(-12));
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0 && year % 100 == 0  && year % 400 == 0){
                return true;
            }
            System.out.println("year is invalid");
        }
        return false;
    }
}
