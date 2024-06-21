import java.util.Scanner;//scanner class is used to get user input

public class print_integervalue{
    public static void main(String[] args) {//main method..its the entry point of the java program
        int num;
        System.err.println("Enter The Number");//printing statement
        Scanner scanner = new Scanner(System.in);//create a instance of the object 
        num = scanner.nextInt();//for storing the user input
        System.out.println("The Number is " + num);//printing the output
    }
}