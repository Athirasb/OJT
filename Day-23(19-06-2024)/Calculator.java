
//its a example program for polymorphism
public class Calculator {
    int add(int a, int b){
        return a+ b;
    }
     double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator cal=new Calculator();
       int sum1=cal.add(5,7);
       double sum2=cal.add(23.6,32.5);
       System.err.println("Sum of Integers:"+sum1);
       System.err.println("Sum of Integers:"+sum2);

    }
}
