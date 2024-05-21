import java.util.Scanner;
public class Math_max{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter two numbers to find the maximum: ");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double max = Math.max(num3, num4);
        System.out.println("The maximum of " + num3 + " and " + num4 + " is " + max);
    }
}

