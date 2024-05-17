// Sum of Positive Numbers using do while loop
import java.util.Scanner;

public class Sumofpositivenumbers {
    public static void main(String[] args) {
        int sum = 0;
        int number;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a number (enter a negative number to stop):");
            number = input.nextInt();

            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("Sum = " + sum);
        input.close();
    }
}

