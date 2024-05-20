import java.util.Scanner;

public class TriangleValidity{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle:");

        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();

        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();

        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();

        // Check if the sum of angles is 180 degrees
        if (isValidTriangle(angle1, angle2, angle3)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // Check if the sum of angles is 180 degrees
        return (angle1 + angle2 + angle3 == 180);
    }
}

