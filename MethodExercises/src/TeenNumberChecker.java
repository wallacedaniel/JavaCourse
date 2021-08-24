public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int value1,  int value2, int value3){
        if ((value1 >= 13 && value1 <= 19) || (value2 >= 13 && value2 <= 19) || (value3 >= 13 && value3 <= 19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int value1){
        if(value1 >= 13 && value1 <= 19){
            return true;
        }
        return false;
    }
}
