import java.util.Scanner;
public class Math_sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double num5 = scanner.nextDouble();
        double sqrt = Math.sqrt(num5);
        System.out.println("The square root of " + num5 + " is " + sqrt);
    }
}
