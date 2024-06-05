import java.util.Scanner;
public class exception{
    public static void accept(int marks) {
        if(marks>100){
            throw new ArithmeticException("Total marks cannot exceed 100");
        }
        else if(marks>=70){
            System.out.println("Excellent");
        }
        else if(marks>30 && marks<=69){
            System.out.println("Good");
        }
        else{
            System.out.println("Fail");
}
    }
    public static void main(String[] args) {
        System.err.println("Enter total marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        accept(marks);
    }
}