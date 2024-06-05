import java.util.Scanner;
class program{
    int num1,num2, res;
    public void calculate(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two values for num1 and num2:");
    num1=sc.nextInt();
    num2=sc.nextInt();
    try{
        res=num1/num2;
        System.out.println("The result is "+res);
    }


    catch(ArithmeticException e){
        System.out.println("Exception occured");
        System.out.println("Error message:"+e);
}
finally{
    System.out.println("Finally block executed after expception");

}
}
}

public class exceptionex{
    public static void main(String args[]){
        program p=new program();
        p.calculate();


}
}