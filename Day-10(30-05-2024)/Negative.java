//6.	Write a program that continuously reads integers from the user and calculates their sum. The program should ignore any negative numbers and should stop reading when the user enters zero. Use the continue statement to skip the negative numbers.
import java.util.Scanner;
public class Negative {

    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                continue;
            }
            if (num == 0) {
                break;
            }

           sum=sum+num;
        }
        System.out.println("Sum of a number is="+sum);
 
}
    }