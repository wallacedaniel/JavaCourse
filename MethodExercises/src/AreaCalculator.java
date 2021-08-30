public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0d));
        System.out.println(area(-1d));
        System.out.println(area(5.0d, 4.0d));
        System.out.println(area(-1d, 4.0d));
    }

    public static double area(double radius){
        if (radius < 0) return -1.0d;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1.0d;
        return x * y;
    }
}
