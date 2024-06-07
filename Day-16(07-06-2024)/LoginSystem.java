import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        String predefinedUsername = "mahima@123";
        String predefinedPassword = "mahima";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
        scanner.close();
    }
}
