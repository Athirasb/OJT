

public class Calculator_1 {
    int add(int x, int y,int z){
        return x+y+z;
    }
     double add(double x, double y,double z){
        return x+y+z;
    }
    public static void main(String[] args) {
        Calculator_1 cal=new Calculator_1();
       int sum1=cal.add(5,7,2);
       double sum2=cal.add(23.6,32.5,23.2);
       System.err.println("Sum :"+sum1);
       System.err.println("Sum :"+sum2);

    }
}
