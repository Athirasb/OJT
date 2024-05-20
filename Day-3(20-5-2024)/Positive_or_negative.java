import java.util.Scanner;

public class Positive_or_negative {
    public static void main (String[] args){
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
            System.out.println("Number is Positive");
        }else if(a<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
