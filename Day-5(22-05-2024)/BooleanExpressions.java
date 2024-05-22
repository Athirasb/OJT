import java.util.Scanner;

public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;

        System.out.print("Give me two numbers. First: ");
        x = keyboard.nextDouble();
        System.out.print("Second: ");
        y = keyboard.nextDouble();

        System.out.println(x + " is LESS THAN " + y + ": " + (x < y));
        System.out.println(x + " is LESS THAN / EQUAL TO " + y + ": " + (x <= y));
        System.out.println(x + " is EQUAL TO " + y + ": " + (x == y));
        System.out.println(x + " is NOT EQUAL TO " + y + ": " + (x != y));
        System.out.println(x + " is GREATER THAN " + y + ": " + (x > y));
        System.out.println(x + " is GREATER THAN / EQUAL TO " + y + ": " + (x >= y));
        System.out.println();

        System.out.println(!(x < y) + " " + (x >= y));
        System.out.println(!(x <= y) + " " + (x > y));
        System.out.println(!(x == y) + " " + (x != y));
        System.out.println(!(x != y) + " " + (x == y));
        System.out.println(!(x > y) + " " + (x <= y));
        System.out.println(!(x >= y) + " " + (x < y));
    }
}
