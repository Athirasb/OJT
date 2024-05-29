import java.util.*;
public class Program2 {
    public static void main(String[] args){
        int num1;
        float num2;
        String str;

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a string:");
        str= sc.nextLine();
        System.out.println("Entered string value is :"+ str);

        System.out.println("Enter a digit:");
        num1= sc.nextInt();
        System.out.println("Entered integer value is :"+ num1);

        System.out.println("Enter a decimal digit:");
        num2= sc.nextFloat();
        System.out.println("Entered decimal value is :"+ num2);
    }
}
