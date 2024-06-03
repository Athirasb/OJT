import java.util.Scanner;

public class Annual_income {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Enter your income");
        int income=s.nextInt();
        if(age<18){
            System.out.println("your not eligible for loan");
        }else if(age>=18 && age<=25 && income>-2500){
            System.out.println("Eligible for a small loan");
        }else if(age >=26 && age<=35 && income>=50000){
            System.out.println("Eligible for a medium loan");
        }else if(age>35 && income>=7500){
            System.out.println("Eligible for a large loan");
        }else{
            System.out.println("Not eligible for loan");
        }
    }
}