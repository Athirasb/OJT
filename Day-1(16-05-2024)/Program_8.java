/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of classes held and attended
        System.out.println("Enter the number of classes held:");
        int classesHeld = scanner.nextInt();

        System.out.println("Enter the number of classes attended:");
        int classesAttended = scanner.nextInt();

        // Calculating percentage of classes attended
        double attendancePercentage = (double) classesAttended / classesHeld * 100;

        // Checking if the student is allowed to sit in the exam
        if (attendancePercentage >= 75)
            System.out.println("Student is allowed to sit in the exam.");
        else
            System.out.println("Student is not allowed to sit in the exam.");

        scanner.close();
    }
}