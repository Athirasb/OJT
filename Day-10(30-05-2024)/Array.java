//3.	Write a program that reads a comma-separated string of numbers from the user and converts it into an array of integers. Then, print the array.
import java.util.Arrays;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
      String c =" ";
      Scanner s=new Scanner(System.in);
      System.out.println("enter the the number");
      String n=s.nextLine();
      
      char[] ch=n.toCharArray();
      System.out.println(Arrays.toString(ch));
   
   

 


   } 
}
