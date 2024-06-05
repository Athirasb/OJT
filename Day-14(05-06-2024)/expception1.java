import java.util.*;

class MyCustomException extends Exception{
    public MyCustomException(String msg) {
        super(msg);
}
}
public class expception1 {
    public static void accept(int marks)throws MyCustomException    {
    if(marks>100 || marks!=0){
        // throw new ArithmeticException(" Total Marks cannot exceed 100");
        throw new MyCustomException(" Total  should not be more than 100 or  less than 0");
    }
    else if(marks>=70){
        System.out.println("Excellent");
    }
    else if(marks>30 && marks <=69){
        System.out.println("Good");
}
else{
    System.out.println("Fail");
}
}

public static void main(String[] args) {
    System.out.println("Enter the total mark:");
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    try{
        accept(marks);
    }
    catch(MyCustomException e){
        System.out.println(e);

    }
    
}
}