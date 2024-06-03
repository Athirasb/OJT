import java.util.Scanner;

public class Positive_or_negative {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(num<0){
            System.out.println("The number negative");
        }else{
            System.out.println("The number is odd");
        }
    }
}
