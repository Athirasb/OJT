//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
class Program_1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length");
        int x = s.nextInt();
        System.out.println("Enter breadth");
        int y = s.nextInt();
        if(x==y){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
    }
}
