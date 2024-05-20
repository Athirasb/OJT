import java.util.Scanner;

public class Voting {
    public static void main (String[] args){
        System.out.println("Enter the age");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=18){
            System.out.println("Your Eligible For voting");
        }else{
            System.out.println("Your Not eligible For Voting");
        }
    }
}
