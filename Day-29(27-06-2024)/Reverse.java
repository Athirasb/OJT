import java.util.Scanner;
class Reverse{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the digits");
        int num=scanner.nextInt();

        int a=num;
        int rev=0;
        int rem=0;

        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;   
        }
        System.out.println("The Given Digits are:- "+a);
        System.out.println("The reverse of the given digits are:-"+rev);


    }

}