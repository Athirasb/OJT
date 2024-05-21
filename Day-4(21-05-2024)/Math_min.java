import java.util.Scanner;
public class Math_min{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Math.min
        System.out.print("Enter two numbers to find the minimum: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double min = Math.min(num1, num2);
        System.out.println("The minimum of " + num1 + " and " + num2 + " is " + min);
    }}
