/*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the character
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        // Checking if the character is lowercase or uppercase
        if (Character.isLowerCase(ch))
            System.out.println("The entered character '" + ch + "' is lowercase.");
        else if (Character.isUpperCase(ch))
            System.out.println("The entered character '" + ch + "' is uppercase.");
        else
            System.out.println("The entered character is not a valid letter.");

        scanner.close();
    }
}
