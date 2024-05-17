/*Take input of age of 3 people by user and determine oldest and youngest among them.*/
import java.util.Scanner;
public class Program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter age of person " + i + ":");
            int age = scanner.nextInt();

            if (age > oldest)
                oldest = age;

            if (age < youngest)
                youngest = age;
        }

        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

        scanner.close();
    }
}