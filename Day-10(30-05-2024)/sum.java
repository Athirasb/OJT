import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
   while(true){
    if(a<0 || b<0){
        break;
    }
    else{
        double add=a+b;
        System.out.println("The sum of two numbers is : "+add);
        break;
    }
   }
          

  
    

        }
    }
