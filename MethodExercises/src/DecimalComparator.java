public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-1.54367, -1.5436798));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        if (number1 < 0){
            number1 = Math.floor(Math.abs(number1) * 1000) / 1000;
            number1 = number1 *= -1;
        } else {
            number1 = Math.floor(number1 * 1000) / 1000;
        }

        if (number2 < 0){
            number2 = Math.floor(Math.abs(number2) * 1000) / 1000;
            number2 = number2 *= -1;
        } else {
            number2 = Math.floor(number2 * 1000) / 1000;
        }

        if (number1 == number2) {
            return true;
        }
        return false;
    }

}
