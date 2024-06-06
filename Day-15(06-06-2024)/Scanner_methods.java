import java.util.Scanner;//importig scanner class to get user input
public class Scanner_methods {
    public static void main(String[] args) {//main method is a entry poi
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String myname=scanner.nextLine();
        System.out.println("Enter your age");
        int myage=scanner.nextInt();
        System.out.println("Enter your favorate number between 400-500");
        double number=scanner. nextDouble();
        System.out.println("Enter your favorate float number");
        float num=scanner.nextFloat();
        //here we can give the code for printing  the ouput 
        System.out.println("****************************");
        System.out.println("my name is"+myname);
        System.out.println("i am"+" "+myage+"years old");
        System.out.println("my favorate number is"+number);
        System.out.println("fav flot is "+num);



    }
}
