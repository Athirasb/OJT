/*Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or
not ( 'Y' or 'N' ) and print accordingly.*/
import java.util.Scanner;

public class Program_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of classes held and attended
        System.out.println("Enter the number of classes held:");
        int classesHeld = scanner.nextInt();

        System.out.println("Enter the number of classes attended:");
        int classesAttended = scanner.nextInt();

        // Input for medical cause
        System.out.println("Do you have a medical cause? (Y/N):");
        char medicalCause = scanner.next().charAt(0);

        // Calculating percentage of classes attended
        double attendancePercentage = (double) classesAttended / classesHeld * 100;

        // Checking if the student is allowed to sit in the exam
        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y')
            System.out.println("Student is allowed to sit in the exam.");
        else
            System.out.println("Student is not allowed to sit in the exam.");

        scanner.close();
    }
}