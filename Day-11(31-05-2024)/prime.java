import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int flag=0;
        int i=2;

        while(i<=(number/2)){
            i=i+1;
            if(number%2==0);
            flag=1;
        }
        if(flag==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}