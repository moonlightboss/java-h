public class MathOperations {
    public static void main(String[] args) {
        int add1 = add(3,4);
        System.out.println(add1);

        int subtract1 = subtract(5, 4);
        System.out.println(subtract1);

        int multiply1 = multiply(5, 4);
        System.out.println(multiply1);

        double divide1 = divide(9,3);
        System.out.println(divide1);

        double findMax1 = findMax(9, 1.1);
        System.out.println(findMax1);

        int difference1 = difference(20, 4);
        System.out.println(difference1);

        int squareArea1 = squareArea(5);
        System.out.println(squareArea1);

        int squarePerimeter1 = squarePerimeter(5);
        System.out.println(squarePerimeter1);

        double convertSecondsToMinutes1 = convertSecondsToMinutes(3500);
        System.out.println(convertSecondsToMinutes1);

        double averageSpeed1 = averageSpeed(35.8, 40);
        System.out.println(averageSpeed1);
        double averageSpeed2 = averageSpeed(79.8, 450);
        System.out.println(averageSpeed2);

        double findHypotenuse1 = findHypotenuse(45.3,85.4);
        System.out.println(findHypotenuse1);

        double circleCircumference1 = circleCircumference(5);
        System.out.println(circleCircumference1);

        double calculatePercentage1 = calculatePercentage(100, 25);
        System.out.println(calculatePercentage1);
        double calculatePercentage2 = calculatePercentage(-100, 25);
        System.out.println("Число отрицательное или равно нулю "+calculatePercentage2);

        double celsiusToFahrenheit1 = celsiusToFahrenheit(100);
        System.out.println(celsiusToFahrenheit1);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(250);
        System.out.println(fahrenheitToCelsius1);
    }
    public static int add (int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        return x / y;
    }
    public static double findMax(double a, double b) {
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int difference(int x, int y) {
        return (x >= y) ? (x - y) : (y - x);
    }
    public static int squareArea(int side) {
        return side * side;
    }
    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        return (distance / time);
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt((a * a)+(b * b));
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part){
        if(total > 0){
            return (part / total) * 100.0;
        }
        else {
            return 0.0;
        }
    }
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
}
