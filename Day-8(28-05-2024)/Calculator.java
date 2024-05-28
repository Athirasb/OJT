public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
    public static void main(String[] args) {
        double num1 = 10, num2 = 5;
        System.out.println("Add: " + add(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2));
    }
}
