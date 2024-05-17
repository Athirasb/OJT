//Take two int values from user and print greatest among them.
import java.util.Scanner;
public class Program_2 {
    public static void main (String[] args){
        Scanner s =new Scanner (System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter the second number");
        int b=s.nextInt();
        if(a>b){
            System.out.println("The greatest number is :"+a);
        }
        else if(b>a){
            System.out.println("The greatest number is :"+b);
        }
        else{
            System.out.println("Both number is equal");
        }
    }
}
