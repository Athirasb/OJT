//2.	Write a program that uses the Scanner class to read a line of text and then counts the number of words in the line. Assume words are separated by spaces.
import java.util.Scanner;

public class count_lines {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the words");
        String lines=s.nextLine();
        String[] words=lines.split(" ");
        System.out.println("Number of lines : " + words.length);

    }
}
