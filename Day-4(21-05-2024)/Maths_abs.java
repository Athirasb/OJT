import java.util.Scanner;
public class Maths_abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its absolute value: ");
        double num6 = scanner.nextDouble();
        double abs = Math.abs(num6);
        System.out.println("The absolute value of " + num6 + " is " + abs);
        scanner.close();
    }
}
