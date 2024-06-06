import java.util.Scanner;// importing scanner class to get the user input
public class userinput_ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        var myname=scanner.nextLine();
        System.err.println("MY name is"+myname);

        
    }
}
