/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
import java.util.Scanner;
public class Program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonusAmount = (yearsOfService > 5) ? (salary * 0.05) : 0;

        System.out.println("Net bonus amount: $" + bonusAmount);

        scanner.close();
    }
}
