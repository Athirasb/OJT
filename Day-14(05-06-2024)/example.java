import java.util.Scanner;

public class example {
    public static void categorize(double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        else if(salary < 20000) {
            System.out.println("Low income");
        }
        else if(salary <= 50000) {
            System.out.println("Middle income");
        }
        else if(salary <= 100000) {
            System.out.println("High income");
        }
        else {
            System.out.println("Very high income");
        }
    }

    public static void main(String[] args) {
        System.err.println("Enter salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        categorize(salary);
    }
}
