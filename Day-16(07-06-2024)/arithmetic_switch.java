//Write a Java program that checks if a user can log in based on a predefined username and password. Use if-else
// statements to validate the credentials and print appropriate messages.
import java.util.Scanner;
public class arithmetic_switch{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        System.out.println("Select the operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);
          double result=0;
        switch (operator){
            case '+' :
            result=num1+num2;
            System.out.println(result);
                break;
            case'-':
            result=num1-num2;
            System.out.println(result);
                break;
            case '/' :
            result=num1/num2;
            System.out.println(result);
                break;
            case '*' :
            result=num1+num2;
            System.out.println(result);
                    break;
        }
    }
        
    }
    
